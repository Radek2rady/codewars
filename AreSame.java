import java.util.Arrays;

public class AreSame {

  public static void main(String[] args) {
    int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
    int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
    System.out.println(comp(a, b));
  }

  public static boolean comp(int[] a, int[] b) {
    if (a == null || b == null) {
      return false;
    }
    if (a.length != b.length) {
      return false;
    }
    Arrays.sort(a);
    Arrays.sort(b);

    for (int i = 0; i < b.length; i++) {
      a[i] = a[i] * a[i];
    }
    Arrays.sort(a);
    Arrays.sort(b);
    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }

    return true;
  }
}

//    int[] aBackub = new int[a.length];
//    for (int i = 0; i < a.length; i++) {
//      aBackub[i] = a[i];
//    }
//    int[] compared = new int[a.length];
//    for (int i = 0; i < a.length; i++) {
//      for (int j = 0; j < b.length; j++) {
//        if (b[j] == a[i] * a[i]) {
//          compared[i] = a[i];
//          b[j] = Integer.MIN_VALUE;
//          a[i] = Integer.MIN_VALUE;
//          break;
//        }
//      }
//    }
//    for (int i = 0; i < aBackub.length; ++i) {
//      if (aBackub[i] != compared[i]) {
//        return false;
//      }
//    }
//    return true;