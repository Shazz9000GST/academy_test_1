// 問3.以下のクラスを適切に分割してください。
public class UserService {

  private final UserMapper userMapper;
  private final PasswordEncoder passwordEncoder;

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

      // メール存在チェック
  public boolean existsByEmail(String email) {
    return userMapper.findByEmail(email) != null;
  }

}

