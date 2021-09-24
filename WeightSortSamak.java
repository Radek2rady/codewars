import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class WeightSortSamak {

  public static void main(String[] args) {
    String strng = "11 11 2000 10003 22 123 1234000 44444444 9999";
    System.out.println(orderWeight(strng));
  }

  public static String orderWeight(String strng) {
    String[] allWeights = strng.split(" ");
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < allWeights.length; i++) {
      int value = getTransformed(allWeights[i]);
      if (map.containsKey(allWeights[i])){
        allWeights[i] = allWeights[i]+"$".repeat(i);
      }
      map.put(allWeights[i], value);
    }

    return map.entrySet().stream().sorted((e1, e2) -> {
      if (e1.getValue().compareTo(e2.getValue()) == 0) {
        return (e1.getKey().compareTo(e2.getKey()));
      }
      return e1.getValue().compareTo(e2.getValue());
    })
        .map(Entry::getKey).collect(Collectors.joining(" ")).replaceAll("[$]", "");
  }

  private static int getTransformed(String weight) {
    int result = 0;
    for (int i = 0; i < weight.length(); i++) {
      result += Integer.parseInt(weight.substring(i, i + 1));
    }
    return result;
  }
}