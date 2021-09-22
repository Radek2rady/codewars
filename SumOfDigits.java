public class SumOfDigits {

  public static void main(String[] args) {
    int a = 561;
    System.out.println(sum(a));
  }

  public static int sum(int a) {
    int b = 0;
    int c = 0;
    while (a >= 10) {
      c = a % 10;
      a = (a - c) / 10;
      b = b + c;
      if (a < 10) {
        b = b + a;
        a = b;
        b = 0;
      }
    }

    return b + a;
  }
}
