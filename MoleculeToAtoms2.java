//// NOT DONE JUST PART

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoleculeToAtoms2 {

  public static void main(String[] args) {
    String water = "K4[ON(SO3)2]2";
    System.out.println(getAtoms(water));
  }

  public static Map<String, Integer> getAtoms(String formula) {
    Map<String, Integer> result = new HashMap<>();
    String brackets = "([)]";
    long countBrackets = 0;
    StringBuilder sb = new StringBuilder();
    List<Integer> bracketsIndexes = new ArrayList<>();
    for (int i = 0; i < brackets.length(); i++) {
      char ch = brackets.charAt(i);
      countBrackets += formula.chars().filter(s -> s == ch).count();
      var indexes = IntStream.range(0, formula.length())
          .filter(index -> formula.charAt(index) == ch)
          .boxed().collect(Collectors.toList());
      for (int in : indexes) {
        bracketsIndexes.add(in);
      }
    }
    int counts = 1;
    var sortedIndexes = bracketsIndexes.stream().sorted().collect(Collectors.toList());
    while (counts <= sortedIndexes.size() / 2) {
      var part = formula.substring(sortedIndexes.get(sortedIndexes.size() / 2 - (counts)) + 1,
          (sortedIndexes.get(sortedIndexes.size() / 2) + counts) - 1);
      var multiply = Integer.parseInt(formula.substring(sortedIndexes.get(sortedIndexes.size() / 2) + counts,
          sortedIndexes.get(sortedIndexes.size() / 2) + counts + 1));
      var b = multiply;
      while (multiply > 0) {
        noBrackets(part, sb);
        multiply--;
      }
      counts++;
    }
    return result;
  }

  public static String noBrackets(String formula, StringBuilder sb) {
    for (int i = 0; i < formula.length(); i++) {
      var ch = formula.charAt(i);
      if (Character.isUpperCase(ch)) {
        sb.append(" " + ch);
      } else if (Character.isDigit(ch)) {
        var multiply = Integer.parseInt(formula.substring(i, i + 1));
        var append = formula.substring(i - 1, i);
        if (Character.isLowerCase(append.charAt(0))) {
          append = formula.substring(i - 2, i);
        }
        while (multiply - 1 > 0) {
          sb.append(" " + append);
          multiply--;
        }
      } else if (!Character.isUpperCase(ch)) {
        sb.append(ch);
      }
    }
    return sb.toString();
  }

}
