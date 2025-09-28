import java.util.Scanner;

public class Solution {
  private static Boolean recFunc(String str, int start, int end) {
    if(start >= end) {
      return true;
    }

    if(str.charAt(start) != str.charAt(end)) {
      return false;
    }
    return recFunc(str, start+1, end-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final String str = sc.nextLine();

    Boolean isPalindrome = recFunc(str, 0, str.length()-1);

    System.out.printf("rev str => %s", isPalindrome);

    sc.close();
  }
}