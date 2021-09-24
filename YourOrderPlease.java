public class YourOrderPlease {

  public static void main(String[] args) {
    System.out.println(order("is2 Thi1s T4est 3a"));
  }

  public static String order(String words) {

    // ...
//    if (words.length() == 0) {
//      return words;
//    }
//    StringBuilder sb = new StringBuilder();
//    String[] wordsSplitted = words.split(" ");
//    int count = 0;
//    while (count < wordsSplitted.length) {
//      for (int i = 0; i < wordsSplitted.length; i++) {
//        char[] word = wordsSplitted[i].toCharArray();
//        for (char ch : word) {
//          if ((Character.isDigit(ch)) && (Integer.valueOf(ch) - 48 == count + 1)) {
////            int chNr = Integer.valueOf(ch) - 48;
////            if (Integer.valueOf(ch) - 48 == count + 1) {
//            sb.append(wordsSplitted[i] + " ");
//            count++;
//          }
//        }
//      }
//      }
//    }
//    return sb.toString().trim();
//  }
//}
//
      String[] arr = words.split(" ");
      StringBuilder result = new StringBuilder("");
      for (int i = 0; i < 10; i++) {
        for (String s : arr) {
          if (s.contains(String.valueOf(i))) {
            result.append(s + " ");
          }
        }
      }
      return result.toString().trim();
    }
  }
