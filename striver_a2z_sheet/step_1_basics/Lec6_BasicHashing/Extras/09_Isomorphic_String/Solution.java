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
    int[] hash = new int[26];
    for(int i = 0; i < str1.length(); i++) {
      int indexChar1 = str1.charAt(i) - 'a';
      int indexChar2 = str2.charAt(i) - 'a';

      if(hash[indexChar1] > 0) {
        if(indexChar2 != hash[indexChar1]) {
          System.out.println("Not isomorphic");
          return;
        }
        continue;
      }
      hash[indexChar1] = indexChar2;
    }

    System.out.println("Isomorphic");

    sc.close();
  }
}
