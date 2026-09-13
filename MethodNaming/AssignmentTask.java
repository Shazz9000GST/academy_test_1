// 問1.以下の不適切なメソッド名を修正してください。
public class AssignmentTask {

  /*
   * パターン1
   */
  public void greetUser(User user) {
    System.out.println("Hello, " + user.getName());
  }

  /*
   * パターン2
   */
  public void greetUser(User user) {
    System.out.println("Hello, " + user.getName());
  }

  /*
   * パターン3
   */
  public void printUserName(User user) {
    System.out.println(user.getName());
  }

  /*
   * パターン4
   */
  public String getUserName(User user) {
    return user.getName();
  }

  /*
   * パターン5: 
   */
  public void printUserName(User user) {
    System.out.println(user.getName());
  }

  /*
   * パターン6
   */
  public User createUser(String name) {
    return new User(name);
  }

  /*
   * パターン7
   */
  public boolean isUserActive(User user) {
    return user.isActive();
  }

}