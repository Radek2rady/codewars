public class MorseCodeDecoder {

//  public static String decode(String morseCode) {
    // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
//    var codeSplitted = morseCode.split(" ");
//    StringBuilder sb = new StringBuilder();
//    for (int i = 0; i < codeSplitted.length; i++) {
//      String st = codeSplitted[i];
//      if ((i != 0 && i != codeSplitted.length) && (st.equals(""))) {
//        if (st.equals(codeSplitted[i + 1]) && !st.equals(codeSplitted[i - 1])) {
//          sb.append(" ");
//        } else if (st.equals(codeSplitted[i - 1])) {
//          continue;
//        }
//      } else if ("MorseCode.get(st)" != null) {
//        sb.append("MorseCode.get(st)");
//      }
//    }
//    return sb.toString();
    public static String decode(String morseCode) {
      String result = "";
      for(String word : morseCode.trim().split("   ")) {
        for(String letter : word.split("\\s+")) {
          result += letter; // MorseCode.get(letter);
        }
        result += ' ';
      }
      return result.trim();
  }

  public static void main(String[] args) {
    String morseCode = "    .... . -.--   .--- ..- -.. .";
    System.out.println(decode(morseCode));
  }
}