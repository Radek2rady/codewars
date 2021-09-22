public class NarcissisticNr {

  public static void main(String[] args) {
    int input = 1634;
    System.out.println(arcissisticNr(input));
  }

  private static boolean arcissisticNr(int input) {
    String nr = String.valueOf(input);
    double temp = 0;
    double result = 0;
    for (int i = 0; i < nr.length(); i++) {
      var nr1 = Character.getNumericValue(nr.charAt(i));
      temp = Math.pow(nr1, nr.length());
      result = result + temp;
    }
    if (result == input) {
      return true;
    }
    return false;
  }
}
