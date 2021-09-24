import java.util.stream.IntStream;

public class EqualSidesOfAnArray {

  public static void main(String[] args) {
    System.out.println(findEvenIndex(new int[]{1, 100, 50, -51, 1, 1}));
  }

  public static int findEvenIndex(int[] arr) {
    // your code
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      int sum1 = IntStream.range(0, i).map(n -> arr[n]).sum();
      int sum2 = IntStream.range(i + 1, arr.length).map(n -> arr[n]).sum();
      if (sum1 == sum2) {
        index = i;
      }
    }
    return index;
  }
}
