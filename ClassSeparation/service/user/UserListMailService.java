public class UserListMailService {

  private final UserMapper userMapper;

  public UserListMailService(UserMapper userMapper) {
    this.userMapper = userMapper;
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

    // メール存在チェック
  public boolean existsByEmail(String email) {
    return userMapper.findByEmail(email) != null;
  }


}