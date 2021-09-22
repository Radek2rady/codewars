public class PersistentBugger {

  public static void main(String[] args) {
    System.out.println(persistence(25));
  }

  public static int persistence(long n) {
    // your code
    int round = 0;
    long sum = 1;
    while (n >= 10 || sum > 1) {
      if (n >= 10) {
        long rest = n % 10;
        sum = rest * sum;
        n = (n - rest) / 10;
        if (n < 10 && sum <= 1) {
          round++;
        }
      } else {
        sum = sum * n;
        n = sum;
        sum = 1;
        round++;
        if (n < 10) {
          return round;
        }
      }
  }
    return round;
}
}

//   lepsi reseni na codewars
//  public static int persistence(long n) {
//    int times = 0;
//    while (n >= 10) {
//      n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
//      times++;
//    }
//    return times;
//  }
