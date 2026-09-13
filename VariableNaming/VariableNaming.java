// 問2.以下の不適切な変数名を修正してください。
public class VariableNaming {

  public void calculateNumbers() {
    /*
     * パターン1
     */
    int first_number = 10;
    int Second_Number = 20;

    /*
     * パターン2
     */
    int a = 5;
    int x = 3;

    /*
     * パターン3
     */
    int return = 100;

    int total_result = first_number + Second_Number;
    int sum = a + x + return;

    System.out.println(total_result);
    System.out.println(sum);
  }
}
