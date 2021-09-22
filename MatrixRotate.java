import java.util.Arrays;

public class MatrixRotate {

  public static void main(String[] args) {
    int[][] matrix1 = new int[][] {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    System.out.println(Arrays.deepToString(rotateMatrix(matrix1)));
  }
  public static int[][] rotateMatrix(int[][] a) {
    int N = 3; // nr of lines and rows
    for (int i = 0; i < N / 2; i++) {
      for (int j = i; j < N - i - 1; j++) {
        int temp = a[i][j];
        a[i][j] = a[N - 1 - j][i];
        a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
        a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
        a[j][N - 1 - i] = temp;
      }
    }
    return a;
  }

}
