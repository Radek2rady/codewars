import java.util.Arrays;

public class FindUniqueNumber {

  public static void main(String[] args) {
    System.out.println(findUniq(new double[]{0, 1, 0}));
  }

  public static double findUniq(double arr[]) {
    // Do the magic
    for (double i : arr) {
      var count = Arrays.stream(arr).filter(e -> e == i).limit(2).count();
      if (count == 1) {
        return i;
      }
    }
    return arr[0];
  }
}