import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HighestScoringWord {

  public static void main(String[] args) {
    System.out.println(high("b aa"));
  }

  public static String high(String s) {
    // Your code here...
    var splitted = s.split(" ");
    HashMap<String, Integer> valuesStrings = new LinkedHashMap<>();
    for (int i = 0; i < splitted.length; i++) {
      int count = 0;
      for (int j = 0; j < splitted[i].length(); j++) {
        count += Character.valueOf(splitted[i].charAt(j)) - 96;
      }
      valuesStrings.put(splitted[i], count);
    }

    var highestValue = (Collections.max(valuesStrings.values()));
    String result = null;
    for (Entry<String, Integer> entry : valuesStrings.entrySet()) {
      if (entry.getValue() == highestValue) {
        result = entry.getKey();
        break;
      }
    }

    return result;
  }

}