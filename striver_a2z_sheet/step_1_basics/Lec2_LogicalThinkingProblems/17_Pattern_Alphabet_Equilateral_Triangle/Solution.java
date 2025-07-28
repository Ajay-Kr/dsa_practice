import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for(int i = 1; i <= n; i++) {
      final int spaces = n-i;
      for(int j = 1; j <= spaces; j++) {
        System.out.print("  ");
      }
      char currentChar = 'A';
      for(int j = 1; j <= i; j++) {
        System.out.print(currentChar++ +" ");
      }

      currentChar = 'A';
      for(int j = 1; j < i; j++) {
        System.out.print(currentChar++ +" ");
      }
      System.out.println();
    }
    
    scanner.close();
  }
}