import java.util.ArrayList;

public class CountingDuplicates {

  public static void main(String[] args) {
    String text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println(countDuplicates(text));
  }

  private static int countDuplicates(String text) {
    String strLower = text.toLowerCase();
    ArrayList arrayList = new ArrayList();
    for (int i = 0; i < strLower.length(); i++) {
      char ch = strLower.charAt(i);
      int count = 0;
      for (int j = 0; j < strLower.length(); j++) {
        if (ch == strLower.charAt(j)) {
          count++;
        }
        var smallCh = text.charAt(i);
        var bigCh = Character.valueOf(text.charAt(i));
        if (count == 2 && (!arrayList.contains(Character.toLowerCase(smallCh))) && (!arrayList
            .contains(Character.toUpperCase(smallCh)))) {
          arrayList.add(text.charAt(i));
        }
      }
    }
    return arrayList.size();

  }


}
