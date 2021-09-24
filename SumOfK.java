import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class SumOfK {

  public static void main(String[] args) {
    List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
    int t = 161;
    int n = 3;
    System.out.println(chooseBestSum(t, n, ts));
  }


  public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
    // your code
    int[] data;
    TreeSet<Integer> sums;
    data = new int[k];
    sums = new TreeSet<>();
    calculateSums(ls, k, 0, 0, data, sums);

    final Iterator<Integer> it = sums.descendingIterator();
    while (it.hasNext()) {
      final Integer next = it.next();
      if (next <= t) {
        return next;
      }
    }
    return null;
  }

  private static void calculateSums(final List<Integer> ls, final int k, final int start,
      final int index, int[] data, TreeSet sums) {
    if (index == k) {
      final int sum = IntStream.of(data).sum();
      sums.add(sum);
      return;
    }
    for (int i = start; i < ls.size(); i++) {
      data[index] = ls.get(i);
      calculateSums(ls, k, i + 1, index + 1, data, sums);
    }
  }
}
