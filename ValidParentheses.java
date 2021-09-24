public class ValidParentheses {

  public static void main(String[] args) {
    System.out.println(validParentheses("32423(sgsd"));
  }

  public static boolean validParentheses(String parens) {
    //Put code below
    int count = 0;
    for (int i = 0; i < parens.length(); i++) {
      var ch = parens.charAt(i);
      if (Character.valueOf(ch).equals('(')) {
        count++;
        if (count < 0) {
          return false;
        }
      } else if (Character.valueOf(ch).equals(')')) {
        count--;
        if (count < 0) {
          return false;
        }
      }
    }
    return count == 0;
  }
}
