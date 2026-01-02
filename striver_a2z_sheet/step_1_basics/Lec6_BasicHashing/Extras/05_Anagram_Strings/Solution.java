/**
 * Check if two strings are anagrams.
 * Use array hashing (size 26).
 */
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    // Input : two strings
    // Anagram : a word or phrase that is made by arranging the letters of another word or phrase in a different order
    // Eg.  tap, pat
    //      rat, tar
    //      cork, rock
    //      lamp, palm
    // Constraints : hash array size 26

    final int MAX_HASH_SIZE = 26;

    // 1. Get inputs
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    // 2. Early return
    if(str1.length() != str2.length()) {
      System.out.println("false");
      return;
    }

    // 3. Ensure all are lowercase 
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // 3. Hash
    int[] hash = new int[MAX_HASH_SIZE];
    for(int i = 0; i < str1.length(); i++) {
      int index = str1.charAt(i) - 'a';
      hash[index]++;
    }

    for(int i = 0; i < str2.length(); i++) {
      int index = str2.charAt(i) - 'a';
      hash[index]--;
    }

    // 4. Final check
    boolean isAnagram = true;
    for(int h : hash) {
      if(h != 0) {
        isAnagram = false;
        break;
      }
    }
    System.out.printf("anagram -> %b", isAnagram);

    sc.close();
  }
}
