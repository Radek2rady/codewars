import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveWhiteSpaces {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("I'm  not        saying that   any of the",
        "Linq   answers that   people have provided         here are bad,",
        "but I   guess I    feel like   there...");
    System.out.println(removeSpaces(list));
  }

  public static List<String> removeSpaces(List<String> list) {
    List<String> newList = new ArrayList<>();
    for (String s : list) {
      var words = s.split(" ");
      List<String> newList2 = new ArrayList<>();
      for (String str : words) {
        if (!str.equals("")) {
          newList2.add(str);
        }
      }
      String newLine = String.join(" ", newList2);
      newList.add(newLine);
    }

    return newList;
  }

}
