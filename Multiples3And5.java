public class Multiples3And5 {

  public static void main(String[] args) {
    System.out.println(multiples(10));
  }

  public static int multiples(int number) {
    //TODO: Code stuff here
    int sum = 0;
    int multiple = 0;
    for (int i = 0; i < number; i++) {
      if (i%3==0 || i%5==0) {
        sum = sum + i;
      }
    }
    return sum;
  }

}
