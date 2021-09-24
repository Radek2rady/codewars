
public class SimpleEncryption1 {

  public static void main(String[] args) {
    System.out.println(encrypt("This is a test!", 3));
    System.out.println(decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
  }

  public static String encrypt(final String text, final int n) {
    // Your code here
    if (n == 0) {
      return text;
    }
    int count = n;
    var textTemp = text;
    while (count > 0) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < textTemp.length(); i++) {
        if (i % 2 == 1) {
          sb.append(textTemp.charAt(i));
        }
      }
      for (int i = 0; i < textTemp.length(); i++) {
        if (i % 2 == 0) {
          sb.append(textTemp.charAt(i));
        }
      }
      textTemp = sb.toString();
      count--;
    }
    return textTemp;
  }

  public static String decrypt(final String encryptedText, final int n) {
    // Your code here
    if (n <= 0) {
      return encryptedText;
    }
    int count = n;
    var textTemp = encryptedText;
    while (count > 0) {
      var half = textTemp.length() / 2;
      var firstHalf = textTemp.substring(0, half);
      var secondHalf = textTemp.substring(half);
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i <= firstHalf.length(); i++) {
        if (i <= secondHalf.length() - 1) {
          sb.append(secondHalf.charAt(i));

        }
        if (i <= firstHalf.length() - 1) {
          sb.append(firstHalf.charAt(i));
        }
      }

      textTemp = sb.toString();
      count--;
    }
    return textTemp;
  }
}