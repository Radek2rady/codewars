public class ProdFibWithCalcFibonacci { // must be public for codewars

  public static void main(String[] args) {
    System.out.println(productFib(274));
  }

  public static long[] productFib(long prod) {
    // your code
    long[] answer = new long[3];
    long isFib = 0;
    long temp = 0;
    int firstNr = 1;
    int secondNr = 1;
    while ((firstNr * secondNr <= prod)) {
      for (int i = 1; i < prod; i++) {
        if (temp == prod) {
          break;
        }
        firstNr = i;
        temp = 0;
        for (int j = 1; j < prod; j++) {
          secondNr = j;
          temp = fib(firstNr) * fib(secondNr);
          if (secondNr > prod || temp >= prod) {
            break;
          }
        }
      }
    }
    if (temp == prod) {
      isFib = 1;
    } else {
      isFib = 0;
    }
    answer[0] = firstNr;
    answer[1] = secondNr;
    answer[2] = isFib;
    return answer;
  }

  static long fib(long n) {
    if (n <= 1) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }
}