import java.util.ArrayList;
import java.util.Arrays;

public class Dinglemouse {


  public static String[] trafficLights(String road, int n) {
    // Your code here!
    String[] string_array = new String[11];
    int count = 0;
    int exeptionCount = 0;
    int charC = Integer.MIN_VALUE;
    while (n + 1 >= 0) {
      ArrayList<String> temp = new ArrayList<>();
      charC = Integer.MIN_VALUE;
      for (int i = 0; i < road.length(); i++) {
        if (road.charAt(i) == 'C') {
          charC = i;
        }
        if (i == 0 && count == 0 && count == i) {
          temp.add("C");
        } else if (i == count) {
          temp.add("C");
        } else if ((count < 4 && i == 4) || (count == 9 && i == 17)) {
          temp.add("R");
        } else if ((count >= 4 && count < 9) && i == 4) {
          temp.add("G");
        } else if (count < 4 && i == 17) {
          temp.add("G");
        } else if ((count == 4 && i == 17) || (count == 9 && i == 4)) {
          temp.add("O");
        } else if (count >= 5 && i == 17) {
          temp.add("R");
        } else if (count == 0 && i == 0) {
          temp.add("C");
        } else {
          temp.add(".");
        }
      }
      road = Arrays.toString(temp.toArray()).replace("[", "").replace("]", "")
          .replace(",", "").replace(" ", "");
      n--;
      if (count <= 4 && exeptionCount == 0) {
        string_array[count] = road;
      } else {
        string_array[count + 1] = road;
      }
      if (count == 4 && exeptionCount == 0) {
        count--;
        exeptionCount++;
      } else {
        count++;
      }
    }
    return string_array;
  }

  public static void main(String[] args) {
    String road = "C...R............G......";
    int n = 10;
    System.out.println(Arrays.toString(trafficLights(road, n)));
  }

}