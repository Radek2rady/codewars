import java.util.stream.Stream;

public class FirstNonRepeatingCharacter {

  public static void main(String[] args) {
    String parameter = "aaabcccdeeef";
    System.out.println(firstNonRepeatingCharacter(parameter));
  }

  private static char firstNonRepeatingCharacter(String parameter) {
    char first = 0;

    for (int i = 0; i < parameter.length() - 1; i++) {
      if ((parameter.charAt(i) != parameter.charAt(i + 1) && (parameter.charAt(i) != parameter
          .charAt(i - 1)))) {
        first = parameter.charAt(i);
        break;
      }
    }
    return first;
//    for (int i = 0; i < parameter.length(); i++) {
//
//      return Stream.of(parameter).filter(p -> p.charAt(i) p.charAt(i+1) != p.charAt(i-1))
//    }
  }
}
