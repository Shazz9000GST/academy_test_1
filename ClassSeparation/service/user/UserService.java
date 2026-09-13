// 問3.以下のクラスを適切に分割してください。
public class UserService {

  private final UserMapper userMapper;
  private final PasswordEncoder passwordEncoder;

  // ユーザー登録
  public User register(UserRegistrationForm form) {
    User existing = userMapper.findByEmail(form.getEmail());
    if (existing != null) {
      throw new IllegalArgumentException("既に登録されています");
    }

    User user = new User();
    user.setName(form.getName());
    user.setEmail(form.getEmail());
    user.setPassword(passwordEncoder.encode(form.getPassword()));
    userMapper.insert(user);

    return userMapper.findById(user.getId());
  }

  // ログイン認証
  public User authenticate(LoginForm form) {
    User user = userMapper.findByEmail(form.getEmail());
    if (user == null) {
      throw new IllegalArgumentException("認証失敗");
    }

    if (!passwordEncoder.matches(form.getPassword(), user.getPassword())) {
      throw new IllegalArgumentException("認証失敗");
    }

    return user;
  }

  // ユーザー一覧取得
  public List<User> getActiveUsers() {
    List<User> users = userMapper.findAll();
    List<User> result = new ArrayList<>();

    for (User user : users) {
      if (!user.isDeleted()) {
        result.add(user);
      }
    }
    return result;
  }

  // ユーザー退会
  public void deactivateUser(Long userId) {
    User user = userMapper.findById(userId);
    if (user == null) {
      throw new IllegalArgumentException("存在しません");
    }

    user.setDeleted(true);
    userMapper.update(user);
  }

  // メール存在チェック
  public boolean existsByEmail(String email) {
    return userMapper.findByEmail(email) != null;
  }
}

