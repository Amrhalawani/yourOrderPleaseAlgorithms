package yourorderpleasecodewars;

import java.util.Arrays;

/**
 *
 * @author Amr Halawani
 */
public class Order {
  public static String order(String words) { 
      if(words.isEmpty()){ return "";}
    String[] wordsArr = words.split("\\s");
    int[] intArr = new int[wordsArr.length];
      for (int x = 0; x < wordsArr.length; x++) {
          intArr[x]= Integer.valueOf(wordsArr[x].replaceAll("\\D+","").trim());}
      int refInt; String refStr;
   for (int i = 1; i < intArr.length; i++) {
    for (int j = i; j > 0; j--) {
     if (intArr[j] < intArr [j - 1]) {
      refInt = intArr[j];
      refStr=wordsArr[j];
      intArr[j] = intArr[j - 1];
      wordsArr[j]= wordsArr[j - 1];
      intArr[j - 1] = refInt;
      wordsArr[j - 1] = refStr;
     }}}
   String result="";
      for (int i = 0; i < wordsArr.length; i++) {
          result = result.concat(wordsArr[i]+" ");
      }
 return result.trim();
  }
}
