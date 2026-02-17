import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    static int longestUniqueSubstr(String s) {
        // code here
        int i = 0;
        int j = 0;
        int maxI = 0;
        int maxJ = 0;
        int maxLen = 0;
        boolean[] seen = new boolean[26];
        while(i < s.length() && j < s.length()) {
            int charIndex = s.charAt(j) - 'a';
            System.out.printf("i-> %d | j-> %d | ch-> %c\n", i, j, s.charAt(j));
            if(!seen[charIndex]) {
                seen[charIndex] = true;
                j++;
                if(maxLen < j-i) {
                    maxLen = j-i;
                    maxI = i;
                    maxJ = j;
                }
            } else {
                i = j;
                j++;
                Arrays.fill(seen, false);
                seen[charIndex] = true;
            }
            
        }
        System.out.printf("Longest string: %s\n", s.substring(maxI, maxJ+1));
        return maxLen;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    int longestUniqueSubstrLength = longestUniqueSubstr(input);
    System.out.printf("Longest string length: %d\n", longestUniqueSubstrLength);
    sc.close();
  }
}
