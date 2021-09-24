import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class WeighSort3 {

  public static void main(String[] args) {
    String strng = "11 11 2000 10003 22 123 1234000 44444444 9999";
    System.out.println(orderWeight(strng));
  }


  public static String orderWeight(String strng) {
//     your code
    if(!strng.trim().contains(" ")) {return strng;}
    String[] weights = strng.split(" ");
    StringBuilder result = new StringBuilder();
    Long[] sums = new Long[weights.length];
    Hashtable<Long, LinkedList> valuesWithStrings = new Hashtable();
    Arrays.sort(weights);

    for (int i = 0; i < sums.length; i++) {
      Long sum = 0L;
      Long num = Long.valueOf(weights[i]);
      while (num > 9) {
        var digit = num % 10;
        sum = sum + digit;
        num = (num - digit) / 10;
      }
      sum = sum + num;

      sums[i] = sum;
      LinkedList<String> sameSums = new LinkedList();
      if (valuesWithStrings.containsKey(sums[i])) {
        sameSums = valuesWithStrings.get(sums[i]);
      }
      sameSums.add(weights[i]);
      valuesWithStrings.put(sums[i], sameSums);
    }
    Arrays.sort(sums);

    for (int i = 0; i < sums.length; i++) {
      if (valuesWithStrings.containsKey(sums[i])) {
        for (int j = 0; j < valuesWithStrings.get(sums[i]).size(); j++) {
          result.append(valuesWithStrings.get(sums[i]).get(j) + " ");
        }
        valuesWithStrings.remove(sums[i]);
      }
    }
    return result.toString().trim();


//    public static String orderWeight(String strng) {
//      return
//          Arrays.stream(strng.split(" "))
//              .sorted(Comparator
//                  .comparing(WeightSort::sumDigits)
//                  .thenComparing(String::compareTo))
//              .collect(Collectors.joining(" "));
//
//    }
//
//    private static Integer sumDigits(String s) {
//      return s.chars().map(c -> c - 48).sum();
//    }
//  }
  }
}
