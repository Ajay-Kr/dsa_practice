/**
 * Count the frequency of each character in a string (only lowercase).
 */
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    // Input  : aabbcad
    // Output : a -> 3
    //          b -> 2
    //          c -> 1
    //          d -> 1

    // 1. Get the input
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    // 2. Hash
    //    Convert char to index
    int[] hash = new int[27];
    final int CHAR_START = 97;
    for(char i = 0; i < str.length(); i++) {
      hash[(int) str.charAt(i) - CHAR_START + 1]++;
    }

    // 3. Print output
    //    Covert the index to character
    for(int i = 0; i < hash.length; i++) {
      if(hash[i] > 0) {
        System.out.printf("%c -> %d\n", (char) i+CHAR_START-1, hash[i]);
      }
    }

    sc.close();
  } 
}
