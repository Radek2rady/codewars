public class Mumbling {

  public static void main(String[] args) {
    System.out.println(accum("ZpglnRxqenU"));
  }

  public static String accum(String s) {
    // your code
    StringBuilder stringBuilder = new StringBuilder();
    int repeat = 0;
    for (int i = 0; i < s.length(); i++) {
      repeat = i;
      String newPart = String.valueOf(s.charAt(i)).toUpperCase();
      stringBuilder.append(newPart);
      while (repeat > 0) {
        String restPart = s.substring(i, i + 1).toLowerCase();
        stringBuilder.append(restPart);
        repeat--;
      }
      if (i != s.length() - 1) {
        stringBuilder.append("-");
      }
    }
    return stringBuilder.toString();
  }

}
