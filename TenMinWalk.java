public class TenMinWalk {

  public static void main(String[] args) {
    char[] walk = new char[]{'n', 's', 'w', 's', 'e'};
    System.out.println(isValid(walk));
  }

  public static boolean isValid(char[] walk) {
    int s = 0;
    int n = 0;
    int e = 0;
    int w = 0;
    for (int i = 0; i < walk.length; i++) {
      if (Character.valueOf(walk[i]).equals('s')) {
        s++;
      } else if (Character.valueOf(walk[i]).equals('n')) {
        n++;
      } else if (Character.valueOf(walk[i]).equals('e')) {
        e++;
      } else if (Character.valueOf(walk[i]).equals('w')) {
        w++;
      }
    }
    if (((s == n) && (s + n + e + w == 10)) && ((e == w) && (s + n + e + w == 10))) {
      return true;
    }
    return false;
  }
}
