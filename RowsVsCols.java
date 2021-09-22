import java.util.HashMap;
import java.util.Map;

public class RowsVsCols {

  public static void main(String[] args) {
    int[][] arr = new int[][]{
        {1, 2, 3, 7},
        {5, 1, 1, 8},
        {0, 1, 1, 2}
    };
    System.out.println(rowsVsCols(arr));
  }

  public static String rowsVsCols(int[][] arr) {
    int rowSum = 0;
    int columnSum = 0;
    int max = Integer.MIN_VALUE;
    String result = null;
    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      rowSum = 0;
      for (int j = 0; j < arr[i].length; j++) {
        rowSum = rowSum + arr[i][j];
      }
      map.put("rowSum " + i, rowSum);
    }

    for (int i = 0; i < arr[0].length; i++) {
      columnSum = 0;
      for (int j = 0; j < arr.length; j++) {
        columnSum = columnSum + arr[j][i];
      }
      map.put("col " + i, columnSum);
    }
    for (Integer i : map.values()) {
      if (i > max) {
        max = i;
      }
    }

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue().equals(max)) {
        result = entry.getKey();
      }
    }
    return result;
  }
}
