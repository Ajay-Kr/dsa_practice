/**
 * Check if two strings are isomorphic
 * Example  : egg → add  → true  
 *            foo → bar  → false  
 *            paper → title → true
 */

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    // 1. Inputs
    Scanner sc = new Scanner(System.in);
    final String str1 = sc.nextLine();
    final String str2 = sc.nextLine();

    // 2. Early return
    if(str1.length() != str2.length()) {
      System.out.println("false");
      return;
    }

    // 3. Hash 
    //    - hash the first apearance of each char
    //    - if same character repeats than should be same as previous
    int[] hashStr1 = new int[27];
    int[] hashStr2 = new int[27];
    for(int i = 0; i < str1.length(); i++) {
      int indexStr1 = str1.charAt(i) - 'a' + 1;
      int indexStr2 = str2.charAt(i) - 'a' + 1;

      if(hashStr1[indexStr1] == 0 && hashStr2[indexStr2] == 0) {
        hashStr1[indexStr1] = indexStr2;
        hashStr2[indexStr2] = indexStr1;
      } else if(hashStr1[indexStr1] != indexStr2 || hashStr2[indexStr2] != indexStr1) {
        System.out.println("Not Isomorphic");
        return;
      }
      // if(hashStr1[indexStr1] > 0 && hashStr1[indexStr1] != indexStr2 ) {
      //   System.out.println("Not Isomorphic");
      //   return;
      // }
      // if(hashStr2[indexStr2] > 0 && hashStr2[indexStr2] != indexStr1 ){
      //   System.out.println("Not Isomorphic");
      //   return;
      // } 
      
      // hashStr1[indexStr1] = indexStr2;
      // hashStr2[indexStr2] = indexStr1;
    }
    

    System.out.println("Isomorphic");

    sc.close();
  }
}
