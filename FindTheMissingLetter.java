public class FindTheMissingLetter {

  public static void main(String[] args) {
    System.out.println(findMissingLetter(new char[]{ 'O','Q','R','S'}));
  }

  public static char findMissingLetter(char[] array) {
//    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//    if (Character.isUpperCase(array[0])) {
//      for (int i = 0; i < array.length; i++) {
//        array[i] = Character.toUpperCase(array[i]);
//      }
//      for (int i = 0; i < alphabet.length; i++) {
//        alphabet[i] = Character.toUpperCase(alphabet[i]);
//      }
//    }
//    int count = array.length;
//    int[] values = new int[array.length];
//    int missing = Integer.MIN_VALUE;
//    while (count > 0) {
//      for (int i = 0; i < array.length; i++) {
//        var ch = array[i];
//        for (int j = 0; j < alphabet.length; j++) {
//          if (alphabet[j] == ch) {
//            values[i] = ch;
//            count--;
//          }
//        }
//      }
//      int count1 = 0;
//
//      for (int i = 0; i < values.length - 1; i++) {
//        int first = values[0];
//        while (count1 < values.length) {
//          if (values[i + count1] != first + count1) {
//            missing = values[count1];
//            return (char) ((char) missing - 1);
//          }
//          count1++;
//        }
//      }
//    }
//    return alphabet[missing + 1];
//  }
//}

    char expectableLetter = array[0];
    for (char letter : array) {
      if (letter != expectableLetter)
        break;
      expectableLetter++;
    }
    return expectableLetter;
  }}