import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortOdd {

  public static void main(String[] args) {
    System.out.println(sortArray(new int[]{1, 7, 2, 8, 5, 4}));
  }

  public static int[] sortArray(int[] array) {
    var oddArr = Arrays.stream(array).filter(i -> i % 2 == 1).toArray();
    var evenArr = Arrays.stream(array).filter(i -> i % 2 == 0).toArray();
    Arrays.sort(oddArr);
    List<Integer> oddList = new ArrayList<>();
    for (int nr : oddArr) {
      oddList.add(nr);
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < oddList.size(); j++) {

        if (array[i] % 2 == 1) {
          array[i] = oddList.get(0);
          oddList.remove(0);

          break;
        }
      }
    }

    return array;
  }
}


