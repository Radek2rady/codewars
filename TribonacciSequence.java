 public class TribonacciSequence {

    public double[] tribonacci(double[] s, int n) {
      if(n == 0) {
        return new double[0];
      }
      double[] result = new double[n];
      if(n < s.length){
        for(int i = 0; i < n; i++){
          result[i] = s[i];
        }

        return result;
      }
      for(int i = 0; i < s.length; i++){
        result[i] = s[i];
      }
      for(int i = s.length; i <= n - 1; i++){
        result[i] = result[i - 3] + result[i - 2] + result[i - 1];
      }

      return result;
    }
  }