import java.util.ArrayList;
import java.util.List;

public class FindOutlier {

  public static void main(String[] args) {
    int[] in = new int[]{160, 3, 1719, 19, 11, 13, -21};
    System.out.println(find(in));
  }

  static int find(int[] integers) {
    List odd = new ArrayList();
    ArrayList even = new ArrayList();
    int oddNr = Integer.MIN_VALUE;
    int evenNr = Integer.MIN_VALUE;
    for (int i = 0; i < integers.length; i++) {
      if (integers[i] % 2 == 0) {
        even.add(integers[i]);
        evenNr = integers[i];

      } else {
        odd.add(integers[i]);
        oddNr = integers[i];
      }
    }
    if (even.size() > odd.size()) {
      return oddNr;
    } else {
      return evenNr;
    }
  }

  //zajimave reseni
//  int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
//  int mod = (sum == 0 || sum == 1) ? 1 : 0;
//
//        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
//                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
}
