public class IsRotation {

  public static void main(String[] args) {
    String input1 = "macska";
    String input2 = "acskam";
    System.out.println(isRotation(input1, input2));
  }

  private static boolean isRotation(String input1, String input2) {
    char firstLetter = input1.charAt(0);
    StringBuilder connected = new StringBuilder();
    String sub;
    for (int i = 0; i < input2.length(); i++) {
      char temp = input2.charAt(i);
      if (firstLetter == temp) {
        sub = input2.substring(i);
        String sub2 = input2.substring(0, i);
        connected.append(sub);
        connected.append(sub2);
      }
      if (input1.equals(connected.toString())) {
        return true;
      }
    }
    return false;
  }
}
