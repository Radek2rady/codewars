public class BitCounting {

  public static void main(String[] args) {
    System.out.println(countBits(7));
  }

  public static int countBits(int n){
    // Show me the code!
    int count = 0;
    var bit = Integer.toBinaryString(n);
    for (int i = 0; i < bit.length(); i++) {
      if (bit.charAt(i) == '1') {
        count++;
      }
    }
    return count;
  }

}
