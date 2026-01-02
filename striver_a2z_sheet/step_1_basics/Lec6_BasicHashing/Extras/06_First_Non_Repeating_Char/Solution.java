/**
 * Given a string, find the first non-repeating character using hashing.
 * Input: aabbcdeaff
 * Output: c
 */

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    // 1. get input
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    final int MAX_HASH_SIZE = 26;

    // 2. hash
    int[] hash = new int[MAX_HASH_SIZE];
    for(int i = 0; i < str.length(); i++) {
      int index = str.charAt(i) - 'a';
      hash[index]++;
    }

    // 3. check of the first char appearing only once
    for(int i = 0; i < str.length(); i++) {
      int index = str.charAt(i) - 'a';
      if(hash[index] == 1) {
        System.out.printf("first non repeating -> %c", str.charAt(i));
        break;
      }
    }

    System.out.println("No non repeating characters");

    sc.close();
  }
}
