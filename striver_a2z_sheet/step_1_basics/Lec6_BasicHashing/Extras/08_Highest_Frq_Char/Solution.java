/**
 * Find the character that appears most frequently in a lowercase string.
 */

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    // Given : all characters are lowercase

    // 1. input
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    str = str.toLowerCase();

    // 2. early return
    if(str.length() <= 0) {
      System.out.println("No string given");
      return;
    }

    // 3. hash
    int[] hash = new int[26];
    for(int i = 0; i < str.length(); i++) {
      hash[str.charAt(i)-'a']++;
    }

    // 4. Get max frq char
    // get index for each char -> get hashed frq -> get max frq & index
    int maxFrqCharIndex = -1;
    int maxFrq = 0;
    for(int i = 0; i < str.length(); i++) {
      final int index = str.charAt(i) - 'a';
      if(hash[index] > maxFrq) {
        maxFrqCharIndex = index;
        maxFrq = hash[index];
      }
    }

    if(maxFrqCharIndex < 0) {
      System.out.println("no char found");
      return;
    }

    System.out.printf("max frq char -> %c", (char) (maxFrqCharIndex + 'a') );

    sc.close();
  }
}
