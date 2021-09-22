public class VowelCount {

  public static void main(String[] args) {

  }

  public static int getCount(String str) {
    int vowelsCount = 0;
    // your code here
    char[] chara = new char[]{'a', 'e', 'i', 'o', 'u'};
    for (int i = 0; i < str.length(); i++) {
      for (Character ch: chara) {
        if (str.charAt(i) ==  ch) {
          vowelsCount++;
        }
      }
    }
    return vowelsCount;
  }

}
