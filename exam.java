import java.util.Arrays;

public class exam {

  public static void main(String[] args) {
    String[] first = new String[]{"banana", "apple"};
    String[] second = new String[]{"orange", "pear", "pear2", "pear3"};

    System.out.println(Arrays.toString(zipMerge(first, second)));
  }

  public static String[] zipMerge(String[] first, String[] second) {
    var length = first.length + second.length;
    var firstLen = 0;
    var secondLen = 0;
    String[] result = new String[length];
    for (int i = 0; i < result.length; i++) {
      if (firstLen < first.length && i % 2 == 0) {
        result[i] = first[firstLen];
        firstLen++;
      } else if (secondLen < second.length && i % 2 == 1) {
        result[i] = second[secondLen];
        secondLen++;
      } else if (firstLen >= first.length) {
        result[i] = second[secondLen];
        secondLen++;
      } else {
        result[i] = first[firstLen];
        firstLen++;
      }
    }
    return result;
  }


}
