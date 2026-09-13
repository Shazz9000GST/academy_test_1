// 問1.以下の不適切なメソッド名を修正してください。
public class AssignmentTask {

  /*
   * パターン1
   */
  public void userMessage(User user) {
    System.out.println("Hello, " + user.getName());
  }

  /*
   * パターン2
   */
  public void getUserMessageAndPrintItToTheConsoleWithHelloPrefixAndUserName(User user) {
    System.out.println("Hello, " + user.getName());
  }

  /*
   * パターン3
   */
  public void process(User user) {
    System.out.println(user.getName());
  }

  /*
   * パターン4
   */
  public String userName(User user) {
    return user.getName();
  }

  /*
   * パターン5: 
   */
  public void print_user_info(User user) {
    System.out.println(user.getName());
  }

  /*
   * パターン6
   */
  public User new(String name) {
    return new User(name);
  }

  /*
   * パターン7
   */
  public boolean active(User user) {
    return user.isActive();
  }

}