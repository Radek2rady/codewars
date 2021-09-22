import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FindOutlier {

  public static void main(String[] args) {
  int[] a = new int[] {1,2,3};
  int[] b = new int[] {2, 5};
     System.out.println(arrayDiff(a, b ));
  }

  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> list = new ArrayList<>();
    loop:
    for (int num : a) {
      for (int i : b) if (num == i) continue loop;
      list.add(num);
    }

    return list.stream().mapToInt(Integer::intValue).toArray();
  }

}
