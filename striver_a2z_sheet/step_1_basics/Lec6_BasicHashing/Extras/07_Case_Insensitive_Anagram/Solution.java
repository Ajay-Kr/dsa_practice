/**
 * Check if two strings are anagrams, ignoring case and ignoring spaces.
 * Input : Input: "Dormitory", "Dirty room"
 * Output: true
 */

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    // 1. Get input
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    // 2. remove spaces and make the case uniform (lowercase)
    str1 = str1.toLowerCase().replaceAll(" ", "");
    str2 = str2.toLowerCase().replaceAll(" ", "");

    // 3. early return
    if(str1.length() != str2.length()) {
      System.out.println("false");
      return;
    }

    // 4. hash
    int[] hash = new int[26];
    for(int i = 0; i < str1.length(); i++) {
      hash[str1.charAt(i)-'a']++;
      hash[str2.charAt(i)-'a']--;
    }

    for(int h : hash) {
      if(h != 0) {
        System.out.println("false");
        return;
      }
    }
    System.out.println("true");

    sc.close();
  }
}
