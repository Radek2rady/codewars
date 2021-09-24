public class DoubleCola {

  public static void main(String[] args) {
    String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
    int n = 628064;
    System.out.println(WhoIsNext(names, n));
  }

  public static String WhoIsNext(String[] names, int n) {
    // Your code is here...
    if (names == null) {
      return null;
    }
    if ((names.length == 0) || (n <= 0)) {
      return null;
    }
    if (names.length == 1) {
      return names[0];
    }
    n--;
    while (n >= names.length) {
      n = (int) Math.floor((n - names.length) / 2);
    }

    return names[n];
  }
}

//    while (n > 1) {
//        String current = namesList.get(0);
//        namesList.remove(namesList.get(0));
//        namesList.add(current);
//        namesList.add(current);
//        n--;
//        }