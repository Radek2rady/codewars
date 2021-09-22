import java.util.ArrayList;

public class WhichAreIn {

  public static void main(String[] args) {
    String[] array1 = new String[]{"arp", "live", "strong"};
    String[] array2 = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
    System.out.println(inArray(array1, array2).toString());
  }

  public static String[] inArray(String[] array1, String[] array2) {
    ArrayList<String> sorted = new ArrayList<>();
    String temp = new String();
    ArrayList<String> bingo = new ArrayList<>();
    for (String s : array1) {
      for (String s2 : array2) {
        if (s2.contains(s)) {
          if (!bingo.contains(s)) {
            bingo.add(s);
          }
        }
      }
    }


    String[] bingoArray = new String[bingo.size()];
    bingoArray = bingo.toArray(bingoArray);
    for (int i = 0; i < bingoArray.length; i++) {
      for (int j = i + 1; j < bingoArray.length; j++) {
      if ((bingoArray[i].compareTo(bingoArray[j])) > 0 ) {
        temp = bingoArray[i];
        bingoArray[i] = bingoArray[j];
        bingoArray[j] = temp;
      }
    }
  }
    //    return bingo.stream().sorted().toArray(String[]::new);
    return bingoArray;
}
}
