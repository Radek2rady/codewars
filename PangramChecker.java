import java.util.HashMap;

public class PangramChecker {

  public static void main(String[] args) {
    String some = new String("The quick brown fox jumps] over the laz dog");
    System.out.println(check(some));
  }

  public static boolean check(String sentence) {
    String change = sentence.toLowerCase();
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    HashMap<Character, Integer> letterCheck = new HashMap<>();
    int counts = 0;
    for (int i = 0; i < change.length(); i++) {
      if (letterCheck.containsKey(change.charAt(i))) {
        counts = letterCheck.get(change.charAt(i));
        letterCheck.put(change.charAt(i), counts++);
      } else {
        letterCheck.put(change.charAt(i), 1);
      }
    }

    for (int i = 0; i < alphabet.length; i++) {
      if (!letterCheck.containsKey(alphabet[i])) {
        return false;
      }
    }
    return true;
  }
}
