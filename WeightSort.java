import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeightSort {

  public static void main(String[] args) {
    String strng = "11 11 2000 10003 22 123 1234000 44444444 9999";
    System.out.println(orderWeight(strng));
  }

  public static String orderWeight(String strng) {
    // your code
    var numbers = strng.split(" ");
    Arrays.sort(numbers);
    HashMap<String, Integer> hashMap = new HashMap<>();
    List<Integer> listDuplicatedSums = new ArrayList<>();
    for (int i = 0; i < numbers.length; i++) {
      int sum = 0;
      Integer num = Integer.valueOf(numbers[i]);
      while (num > 9) {
        var digit = num % 10;
        sum = sum + digit;
        num = (num - digit) / 10;
      }
      sum = sum + num;
      if (hashMap.containsValue(sum)) {
        listDuplicatedSums.add(sum);
      }
      hashMap.put(numbers[i], sum);
    }

    var valuesSorted = hashMap.entrySet().stream().sorted((i1, i2) ->
        i1.getValue().compareTo(i2.getValue())).map(Map.Entry::getKey)
        .collect(Collectors.toList())
        .toString().replace(",", "").replace("[", "").replace("]", "");

    List<String> listDuplicatedKeys = new ArrayList<>();
    List<String> listStrng = List.of(strng);
    List<String> keyDuplicated = new ArrayList<>();
    while (listDuplicatedSums.size() > 0) {
      for (Integer i : listDuplicatedSums) {
//   if (va)
        for (String s : keyDuplicated) {
          listDuplicatedKeys.add(s);
        }
      }
    }

    var splittedValues = valuesSorted.split(" ");
    List<String> listValues = Arrays.stream(splittedValues).collect(Collectors.toList());

    StringBuilder sb = new StringBuilder();

    while (listDuplicatedSums.size() > 0) {
      for (int i = 0; i < numbers.length; i++) {
        String nr = numbers[i];
        for (int j = 0; j < splittedValues.length; j++) {
          if (!listDuplicatedSums.contains(nr)) {
            if (splittedValues[j].equals(nr) && j != splittedValues.length - 1) {
              sb.append(nr + " ");
            } else if (splittedValues[j].equals(nr) && j == splittedValues.length - 1) {
              sb.append(nr);
            }
          } else if (listDuplicatedSums.contains(nr)) {
            for (int k = 0; k < listDuplicatedSums.size(); k++) {
              if (nr.equals(listDuplicatedSums.get(k)) && j != splittedValues.length - 1) {
                sb.append(nr + " ");
                listDuplicatedSums.remove(nr);
              } else if (nr.equals(listDuplicatedSums.get(k)) && j == splittedValues.length - 1) {
                sb.append(nr);
                listDuplicatedSums.remove(nr);
              }
            }
          }
        }

//    StringBuilder sb = new StringBuilder();
//    int count = 0;
//    while (listValues.size() > 0) {
//      for (int i = 0; i < numbers.length; i++) {
//        String nr = numbers[i];
//        List<String> tempList = new ArrayList<>();
//        for (int j = 0; j < splittedValues.length; j++) {
//          if (splittedValues[j].equals(nr)) {
//            count++;
//            if (count > 1) {
//              tempList.add(nr);
//            } else if (splittedValues[j].equals(nr) && j != splittedValues.length -1) {
//              sb.append(nr + " ");
//              count = 0;
//            } else if (splittedValues[j].equals(nr) && j == splittedValues.length -1) {
//              sb.append(nr);
//              count = 0;
//            }
//          }
//          for (int k = 0; k < tempList.size(); k++) {
//            if (Stream.of(numbers).findFirst().equals(tempList.indexOf(i))) {
//              sb.append(tempList.indexOf(i));
//              tempList.remove(i);
//              count = 0;
//            }
//          }
//        }
//      }
//    }

      }
    }
    return sb.toString();
  }
}