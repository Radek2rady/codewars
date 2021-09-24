import java.util.ArrayList;
import java.util.List;

public class ValidBraces {

  public static void main(String[] args) {
    System.out.println(isValid("[(])"));
  }

  public static boolean isValid(String braces) {
    // Add code here
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    List<Character> order = new ArrayList<>();
    for (int i = 0; i < braces.length(); i++) {
      char ch = braces.charAt(i);
      if (ch == '[') {
        count1++;
        order.add(ch);
      } else if (ch == '(') {
        count2++;
        order.add(ch);
      } else if (ch == '{') {
        count3++;
        order.add(ch);
      } else if (ch == ']') {
        count1--;
        if (order.size() < 1) {
          return false;
        }
        if (order.get(order.size() - 1) == '[') {
          order.remove(order.get(order.size() - 1));
        } else {
          return false;
        }
      } else if (ch == ')') {
        count2--;
        if (order.size() < 1) {
          return false;
        }
        if (order.get(order.size() - 1) == '(') {
          order.remove(order.get(order.size() - 1));
        } else {
          return false;
        }
      } else if (ch == '}') {
        count3--;
        if (order.size() < 1) {
          return false;
        }
        if(order.get(order.size() - 1) == '{') {
          order.remove(order.get(order.size() - 1));
        } else {
          return false;
        }
      }
      if (count1 < 0 || count2 < 0 || count3 < 0) {
        return false;
      }
    }
    return count1 == 0 && count2 == 0 && count3 == 0;
  }

}