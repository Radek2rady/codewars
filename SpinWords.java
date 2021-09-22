public class SpinWords {

  public static void main(String[] args) {
    System.out.println(spinWords("This is a test"));
  }

  private static String spinWords(String sentence) {
    StringBuilder spinnedString = new StringBuilder();
    var word = sentence.split(" ");
    for (int i = 0; i < word.length; i++) {
      if (word[i].length() <= 4) {
        spinnedString.append(word[i]);
        if (i < word.length - 1) {
          spinnedString.append(" ");
        }
      } else {
        StringBuilder temp = new StringBuilder();
        for (int j = word[i].length() - 1; j >= 0; j--) {
          temp.append(word[i].charAt(j));
        }
        spinnedString.append(temp.toString());
        if (i < word.length - 1) {
          spinnedString.append(" ");
        }
      }
    }
    return spinnedString.toString();
  }
}
