public class SimplePigLatin {

  public static void main(String[] args) {
    System.out.println(pigIt("oratay oay oresmay !"));
  }

  public static String pigIt(String str) {
    // Write code here
    var words = str.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      var change = words[i].charAt(0);
      if (Character.isLetter(change)) {
        sb.append(words[i].substring(1) + words[i].substring(0, 1) + "ay".replaceAll("!.", "!."));
      } else {
        sb.append(words[i]);
      }
      if (i != words.length - 1) {
        sb.append(" ");
      }
    }
    return sb.toString();
  }

}
