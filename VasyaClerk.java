import java.util.HashMap;

public class VasyaClerk {

  public static void main(String[] args) {
    System.out.println(Tickets(new int[]{25, 50, 25, 100, 100}));
  }

  public static String Tickets(int[] peopleInLine) {
    //Your code is here...
    int cash = 0;
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int m : peopleInLine) {
      if (m == 25) {
        cash += m;
        if (hashMap.containsKey(25)) {
          var val = hashMap.get(m);
          hashMap.put(m, val + 1);
        } else {
          hashMap.put(m, 1);
        }
      } else if (m == 50 && !hashMap.containsKey(25)) {
        return "NO";
      } else if (m == 50) {
        cash += m;
        if (hashMap.containsKey(50)) {
          var val = hashMap.get(m);
          hashMap.put(m, val + 1);
        } else {
          hashMap.put(m, 1);
        }
        var val = hashMap.get(25);
        if (val < 1) {
          return "NO";
        }
        hashMap.replace(25, val - 1);
        cash -= m - 25;

      }
     else if (m == 100) {
        cash += m;
        if (hashMap.containsKey(100)) {
          var val = hashMap.get(m);
          hashMap.put(m, val + 1);
        } else {
          hashMap.put(m, 1);
        }
        if ((hashMap.containsKey(50) && !hashMap.containsKey(25)) || !hashMap.containsKey(25)) {
          return "NO";
        }  else if (hashMap.containsKey(50)) {
          var val = hashMap.get(50);
          if (val < 1) {
            return "NO";
          }
          hashMap.replace(50, val - 1);
          var val25 = hashMap.get(25);
          if (val25 < 1) {
            return "NO";
          }
          hashMap.replace(25, val25 - 1);
          cash -= m - 75;
        } else if (hashMap.containsKey(25)) {
          var val = hashMap.get(25);
          if (val < 3) {
            return "NO";
          }
          var val25 = hashMap.get(25);
          hashMap.replace(25, val25 - 3);
        }
      }
    }
  var hashString = hashMap.toString();
    return"YES";
}
}