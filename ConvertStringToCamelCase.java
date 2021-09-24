class ConvertStringToCamelCase {

  public static void main(String[] args) {
    System.out.println(toCamelCase("the-stealth-warrior"));
  }

  static String toCamelCase(String s) {
    StringBuilder sb = new StringBuilder();
    var words = s.split("[_-]");
    for (int i = 0; i < words.length; i++) {
      if (i == 0) {
        sb.append(words[i]);
      } else {

        var ch = words[i].charAt(0);
        var CH = Character.toUpperCase(ch);
        sb.append(words[i].substring(0, 1).replace(ch, CH) + words[i].substring(1));
      }
    }
    return sb.toString();
  }
}