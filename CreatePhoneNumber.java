public class CreatePhoneNumber {

  public static void main(String[] args) {
    System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
  }

  public static String createPhoneNumber(int[] numbers) {
    // Your code here!
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < numbers.length; i++) {
      if (i == 0) {
        stringBuilder.append("(" + numbers[i]);
      } else if (i == 1) {
        stringBuilder.append(numbers[i]);
      } else if (i == 2) {
        stringBuilder.append(numbers[i] + ") ");
      } else if (i == 3 || i == 4) {
        stringBuilder.append(numbers[i]);
      } else if (i == 5) {
        stringBuilder.append(numbers[i] + "-");
      } else if (i > 5) {
        stringBuilder.append(numbers[i]);
      }
    }
    return stringBuilder.toString();
  }

}
