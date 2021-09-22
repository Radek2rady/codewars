public class BalancedMatrix {

  public static void main(String[] args) {
    int[][] matrix1 = new int[][]{
        {0, -1, 5, 4},
        {5, 0, 5, 1},
        {1, 2, 0, 1},
        {1, 2, 3, 0}
    };

    int[][] matrix2 = new int[][]{
        {1, 0, 1, 4},
        {5, 2, 9, 3},
        {1, 2, 3, 1},
        {1, 6, 3, 4}
    };

    System.out.println(isBalanced(matrix1));
    System.out.println(isBalanced(matrix2));
  }

  public static boolean isBalanced(int[][] matrix) {
    int sumUpper = 0;
    int sumLower = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (i > j) {
          sumUpper = sumUpper + matrix[i][j];
        }
        if (i < j) {
          sumLower = sumLower + matrix[i][j];
        }
      }
    }

    return sumLower == sumUpper;
  }

}
