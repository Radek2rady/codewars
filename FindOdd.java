public class FindOdd {

  public static void main(String[] args) {
    int[] a = new int[] {1,2,2,3,3,3,4,3,3,3,2,2,1};
    System.out.println(findIt(a));
  }

  public static int findIt(int[] a) {
    int odd = Integer.MIN_VALUE;
    var number = Integer.MIN_VALUE;

    for (int i = 0; i < a.length; i++) {
      number = a[i];
      odd = 0;
      for (int j = 0; j < a.length; j++) {
        if (number == a[j]) {
          odd++;
      }
      }
      if (odd % 2 == 1) {
        return number;
      }
    }

    return number;
  }

}
