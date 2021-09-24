public class PlayingWithDigits {

  public static void main(String[] args) {
    System.out.println(digPow(46288, 3));
  }

  public static long digPow(int n, int p) {
    // your code
    if (n == 0 || p == 0) {
      return -1;
    }
    double sum = 0;
    String nString = String.valueOf(n);
    while (nString.length() >= 1) {
      int nr = Integer.valueOf(nString.substring(0, 1));
      sum = sum + Math.pow(nr, p);
     nString = nString.substring(1);
     p++;
    }
  var result = (long) sum / n;
    if (result != (long) sum / n || result == 0 || result - (long) sum / n != (double) 0 || sum % n != 0) {
      return -1;
    }
    return (long) sum / n;
  }
}
