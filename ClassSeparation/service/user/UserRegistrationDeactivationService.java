public class UserRegistrationDeactivationService {

  private final UserMapper userMapper;
  private final PasswordEncoder passwordEncoder;

  public UserRegistrationDeactivationService (UserMapper userMapper, PasswordEncoder passwordEncoder) {
    this.userMapper = userMapper;
    this.passwordEncoder = passwordEncoder;
  }

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

    // ユーザー退会
  public void deactivateUser(Long userId) {
    User user = userMapper.findById(userId);
    if (user == null) {
      throw new IllegalArgumentException("存在しません");
    }

    user.setDeleted(true);
    userMapper.update(user);
  }

  
}