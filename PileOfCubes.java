public class PileOfCubes {

  public static void main(String[] args) {
    System.out.println(findNb(1071225));
  }

  public static long findNb(long m) {
    // your code

    long mm = 0;
    long n = 0;
    while (mm < m) {
      n = n + 1;
      mm = mm + n * n * n;
    }
    if (mm == m) {
      return n;
    }
    return -1;
  }
}