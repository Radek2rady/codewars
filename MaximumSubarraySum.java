public class MaximumSubarraySum {

  public static void main(String[] args) {
    System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

  public static int sequence(int[] arr) {
      int sum = 0, ans = 0;
      for (int w : arr) {
        sum = Math.max(0, sum + w);
        ans = Math.max(ans, sum);
      }
    return ans;
  }
}