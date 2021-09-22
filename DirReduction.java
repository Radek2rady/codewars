import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {

  public static void main(String[] args) {
    String [] array = new String[]{"NORTH", "SOUTH", "EAST", "WEST"};
    System.out.println(Arrays.toString(dirReduc(array)));
  }


  public static String[] dirReduc(String[] arr) {
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    int position = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        list1.add(arr[i]);
        position++;
        break;
      }
      if ((arr[i].equals("NORTH") && arr[i + 1].equals("SOUTH")) || (arr[i].equals("SOUTH")
          && arr[i + 1].equals("NORTH"))) {
        i++;
      } else if ((arr[i].equals("EAST") && arr[i + 1].equals("WEST")) || (arr[i].equals("WEST")
          && arr[i + 1].equals("EAST"))) {
        i++;

      } else {
        list1.add(arr[i]);
        position++;
      }
    }
    int position2 = 0;
    for (int i = 0; i < list1.size(); i++) {
      if (i == list1.size() - 1) {
        list2.add(list1.get(i));
        position2++;
        break;
      }
      if ((list1.get(i).equals("NORTH") && list1.get(i+1).equals("SOUTH")) || (list1.get(i).equals("SOUTH")
          && list1.get(i+1).equals("NORTH"))) {
        i++;
      } else if ((list1.get(i).equals("EAST") && list1.get(i+1).equals("WEST")) || (list1.get(i).equals("WEST")
          && list1.get(i+1).equals("EAST"))) {
        i++;

      } else {
        list2.add(list1.get(i));
        position2++;
      }
    }
    String[] array = new String[list2.size()];
//    System.out.println(list2.toArray(array));
    return list2.toArray(array);
  }
}