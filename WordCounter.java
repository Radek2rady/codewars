import java.util.Arrays;
import java.util.List;

public class WordCounter {

  public static void main(String[] args) {
    String string = "asd";
    List<String> list = Arrays.asList("Asd asddékjfbuwg asd.", "nfoitgibwuob", "dsa asd");
    System.out.println(wordCounter(string, list));
  }

  public static int wordCounter(String string, List<String> list) {
    int count = 0;
    for (String s : list) {
        var sSplit = s.replaceAll("\\p{Punct}", "");
      var split = sSplit.split(" ");

      for (int i = 0; i < split.length; i++) {
        var sSmall = split[i].toLowerCase();
        if ((sSmall.contains(string)) && sSmall.length() == 3) {
          count++;
        }
      }
    }
    return count;
  }
}
