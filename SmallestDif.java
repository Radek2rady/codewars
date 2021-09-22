public class SmallestDif {

  public static void main(String[] args) {
    int[] array = new int[]{4, 1, 58, 34, 55};
    System.out.println(smallestDif(array));
  }

  public static int smallestDif(int[] array) {
    int diff = Integer.MAX_VALUE;
    int firstNum = 0;

    for (int i = 0; i < array.length - 1; i++) {
      firstNum = array[i];
      for (int j = 0; j < array.length; j++) {
        if (i == 0) {
          diff = firstNum;
        }

        if ((Math.abs(firstNum - array[j]) < diff) && firstNum != array[j]) {
          diff = Math.abs(firstNum - array[j]);
        }

      }
    }

    return diff;
  }

}
