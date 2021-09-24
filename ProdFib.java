public class ProdFib { // must be public for codewars

  public static void main(String[] args) {
    System.out.println(productFib(714));
  }

  public static long[] productFib(long prod) {
    // your code
    long firstNr = 0;
    long secondNr = 1;
    long[] answer = new long[3];
    long temp = 0;
    while (temp <= prod) {
      if (temp == prod) {
        answer[0] = firstNr;
        answer[1] = secondNr;
        answer[2] = 1;
        return answer;
      }
      secondNr += firstNr;
      firstNr = secondNr - firstNr;
      temp = firstNr * secondNr;
    }
    answer[0] = firstNr;
    answer[1] = secondNr;
    answer[2] = 0;
    return answer;
  }
}