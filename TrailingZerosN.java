public class TrailingZerosN {

  public static void main(String[] args) {
    System.out.println(zeros(17));
  }

  public static int zeros(int n) {
    // your beatiful code here
    int count = 0;
    while (n != 0) {
      count += (int) Math.floor(n / 5);
      n /= 5;
    }
    return count;
  }
}