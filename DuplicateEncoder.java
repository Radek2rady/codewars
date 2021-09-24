import java.util.Locale;

public class DuplicateEncoder {
  static String encode(String word){
    String wordDecapitalisated = word.toLowerCase();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < wordDecapitalisated.length(); i++) {
      char ch = wordDecapitalisated.charAt(i);
      int count = 0;
      for (int j = 0; j < wordDecapitalisated.length(); j++) {
        if (ch == wordDecapitalisated.charAt(j)) {
          count++;
        }
      }
      if (count > 1) {
        sb.append(")");
      } else sb.append("(");
    }
    return sb.toString();

//    word = word.toLowerCase();
//    String result = "";
//    for (int i = 0; i < word.length(); ++i) {
//      char c = word.charAt(i);
//      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
//    }
//    return result;
  }

  public static void main(String[] args) {
    String word = "(( @";
    System.out.println(encode(word));
  }
}
