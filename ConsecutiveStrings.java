import java.util.Arrays;
import java.util.Comparator;

class ConsecutiveStrings {

  public static void main(String[] args) {
    System.out.println(longestConsec(
        new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
  }

  public static String longestConsec(String[] strarr, int k) {
    // your code
    if (strarr == null || k == 0 || k > strarr.length || k < 0) {
      return "";
    }
    if (k == 1) {
var a =  Arrays.stream(strarr)
    .sorted((x, y) -> Integer.compare(y.length(), x.length())).findFirst().orElse(null).toString();
return  a;
    }
    int count = 0;
    StringBuilder sb = new StringBuilder();

      String  temp = "";
    int totalCount = 0;
      for (int i = 0; i < strarr.length; i++) {
        temp = temp.concat(strarr[i]);
        count++;
        totalCount++;
        if (count == k) {
          sb.append(temp + " ");
          count = 0;
          temp = "";
          i = i - (totalCount - 1);
          totalCount = 0;
        }
      }

    var list = sb.toString().split(" ");
    String result = null;
    int size = 0;
    for (String s : list) {
      if (s.length() > size) {
        result = s;
        size = s.length();
      }
    }
    return result;
  }
}

