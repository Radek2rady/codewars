//import java.util.HashMap;
//import java.util.Map;
//
//class MoleculeToAtoms {
//
//  public static void main(String[] args) {
//    String water = "K4[ON(SO3)2]2";
//    System.out.println(getAtoms(water));
//  }
//
//
//  public static Map<String, Integer> getAtoms(String formula) {
//    // Your code here!
//    String OpBrackets = "([";
//    String ClosBrackets = ")]";
//    Map<String, Integer> result = new HashMap<>();
//    StringBuilder sb = new StringBuilder();
//    for (int i = 0; i < formula.length(); i++) {
//      char ch = formula.charAt(i);
//      if (OpBrackets.contains(String.valueOf(ch))) {
//        withBrackets(ch, formula, sb);
//        i = indexBracket + 1;
//        indexBracket = Integer.MIN_VALUE;
//      } else if (Character.isUpperCase(ch)) {
//        sb.append(" " + ch);
//      } else if (Character.isDigit(ch)) {
//        var multiply = Integer.parseInt(formula.substring(i, i + 1));
//        var append = formula.substring(i - 1, i);
//        if (Character.isLowerCase(append.charAt(0))) {
//          append = formula.substring(i - 2, i);
//        }
//        while (multiply - 1 > 0) {
//          sb.append(" " + append);
//          multiply--;
//        }
//      } else if (!Character.isUpperCase(ch)) {
//        sb.append(ch);
//      }
//    }
//
//    var elements = sb.toString().split(" ");
//    for (String atom : elements) {
//      if (atom.equals("")) {
//        continue;
//      } else if (result.containsKey(atom)) {
//        var count = result.get(atom);
//        result.put(atom, count + 1);
//      } else if (!result.containsKey(atom)) {
//        result.put(atom, 1);
//      }
//
//    }
//    return result;
//  }
//
//  public static String withBrackets(StringBuilder sb, String formula, char ch) {
//    String OpBrackets = "([";
//    String ClosBrackets = ")]";
//    var indexBracket = formula.indexOf(ClosBrackets.charAt(OpBrackets.indexOf(ch)));
//    sb.append(" ");
//    var sameChar = OpBrackets.indexOf(ch);
//    indexBracket = formula.indexOf(ClosBrackets.charAt(sameChar));
//    var multiply = Integer.parseInt(formula.substring(indexBracket + 1, indexBracket + 2));
//    sb.append(" ");
//    var temp = formula.substring(i + 1, indexBracket);
//    for (int l = 0; l < temp.length(); l++) {
//      var chTemp = temp.charAt(l);
//      var currMultiply = multiply;
//      while (currMultiply > 0) {
//        if (Character.isUpperCase(chTemp)) {
//          sb.append(" " + chTemp);
//        } else if (!Character.isUpperCase(chTemp)) {
//          sb.append(chTemp);
//        }
//        currMultiply--;
//      }
//    }
//    return sb.toString(),indexBracket + 1;
//  }
//}