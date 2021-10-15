import java.math.BigInteger;

public class IsNumberPrime {

  public static void main(String[] args) {
    System.out.println(isPrime(5));
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    BigInteger bigInt = BigInteger.valueOf(num);
    return bigInt.isProbablePrime(100);
  }
}