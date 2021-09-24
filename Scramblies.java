import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Scramblies {

  public static void main(String[] args) {
    System.out.println(scramble("scriptjavx", "javascript"));
  }

  public static boolean scramble(String str1, String str2) {
    // your code
    if (str1.length() == 0 || str2.length() == 0) {
      return false;
    }

    char[] str1Char = str1.toCharArray();
    char[] str2Char = str2.toCharArray();

    Arrays.sort(str1Char);
    Arrays.sort(str2Char);

    for (int i = 0; i < str1.length(); i++) {
      str1Char[i] = str1.charAt(i);
    }
    for (int i = 0; i < str2Char.length; i++) {
      str2Char[i] = str2.charAt(i);
    }
    List<Character> listStr2 = new ArrayList<>();
    for (int i = 0; i < str2.length(); i++) {
      listStr2.add(str2.charAt(i));
    }
    for (int i = 0; i < str1.length(); i++) {
      var toCheck = str1.charAt(i);
      var count1 = str1.chars().filter(c -> c == toCheck).count();
      var count2 = str2.chars().filter(c -> c == toCheck).count();
      for (int j = 0; j < str2Char.length; j++) {
        if (str2Char[j] == toCheck && count1 >= count2) {
          listStr2.remove(Character.valueOf(toCheck));
          if (listStr2.size() == 0) {
            return true;
          }
        }
      }
    }
    return listStr2.size() == 0;
  }
}