import java.util.Arrays;

public class ArrayDiff {

  public static void main(String[] args) {
    System.out.println(arrayDiff(new int[]{1, 2, 2}, new int[]{1}));
  }

  public static int[] arrayDiff(int[] a, int[] b) {
    // Your code here
    int[] result = new int[a.length];
    int count = 0;
    if (b.length == 0) {
      return a;
    } else if (a.length == 0) {
      return a;
    }
    for (int i = 0; i < a.length; i++) {
      int checking = a[i];
        if (!Arrays.stream(b).filter(nr -> nr == checking).findFirst().isPresent()) {
          result[count] = a[i];
          count++;

      }
    }
    int[] clearResult = new int[count];
    for (int i = 0; i < clearResult.length; i++) {
      clearResult[i] = result[i];
    }
    return clearResult;

//    public static int[] arrayDiff(int[] a, int[] b) {
//      List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
//      List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
//      listA.removeAll(listB);
//      return listA.stream().mapToInt(e -> e).toArray();
//    }
  }

}
