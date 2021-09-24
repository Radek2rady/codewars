public class RomanNumeralsEncoder {

  public static void main(String[] args) {
    System.out.println(solution(1111));
  }

  public static String solution(int n) {
    String nString = String.valueOf(n);
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < nString.length(); i++) {
      var subString = nString.substring(i);
      int value = Integer.valueOf(subString.charAt(0)) - 48;
      if (subString.length() == 1) {
        conversion(value, sb);
        return sb.toString();
      } else if (subString.length() == 2) {
        if (value == 9) {
          sb.append("XC");
        } else if (value == 8) {
          sb.append("LXXX");
        } else if (value == 7) {
          sb.append("LXX");
        } else if (value == 6) {
          sb.append("LX");
        } else if (value == 5) {
          sb.append("L");
        } else if (value == 4) {
          sb.append("XL");
        }  else if (value == 3) {
          sb.append("XXX");
        } else if (value == 2) {
          sb.append("XX");
        } else if (value == 1) {
          sb.append("X");
        }
      } else if (subString.length() == 3) {
        if (value == 9) {
          sb.append("CM");
        } else if (value == 8) {
          sb.append("DCCC");
        } else if (value == 7) {
          sb.append("DCC");
        } else if (value == 6) {
          sb.append("DC");
        } else if (value == 5) {
          sb.append("D");
        } else if (value == 4) {
          sb.append("CD");
        }  else if (value == 3) {
          sb.append("CCC");
        } else if (value == 2) {
          sb.append("CC");
        } else if (value == 1) {
          sb.append("C");
        }
      } else if (subString.length() > 3) {
        int thousands = Integer.valueOf(subString.charAt(i) - 48);
        while (thousands > 0) {
          sb.append("M");
          thousands--;
        }
      }
    }
    return sb.toString();
  }


  public static String conversion(int value, StringBuilder sb) {
    if (value > 0 && value < 4) {
      while (value > 0) {
        sb.append("I");
        value--;
      }
    } else if (value == 4) {
      sb.append("IV");
    } else if (value == 5) {
      sb.append("V");
    } else if (value == 6) {
      sb.append("VI");
    } else if (value == 7) {
      sb.append("VII");
    } else if (value == 8) {
      sb.append("VIII");
    } else if (value == 9) {
      sb.append("IX");
    }
    return sb.toString();
  }
}