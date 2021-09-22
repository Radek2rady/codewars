public class DuplicateCount {
  public static void main(String[] args) {
    String text = "aaAAbaBBccCCCddddDDDe";
    System.out.println(countDuplicates(text));
  }

  private static int countDuplicates(String text) {
    int ans = 0;
    text = text.toLowerCase();
    while (text.length() > 0) {
      String firstLetter = text.substring(0,1);
      text = text.substring(1);
      if (text.contains(firstLetter)) ans ++;
      text = text.replace(firstLetter, "");
    }
    return ans;
  }

}
