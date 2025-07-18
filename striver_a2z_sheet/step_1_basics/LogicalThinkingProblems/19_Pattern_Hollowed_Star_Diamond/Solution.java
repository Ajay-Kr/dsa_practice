import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for(int i = 1; i <= n; i++) {
      for(int j = n; j >= i; j--) {
        System.out.print("* ");
      }
      
      int spaces = (i-1)*2;
      for(int j = 1; j <= spaces; j++) {
        System.out.print("  ");
      }
      for(int j = i; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int i = n; i >= 1; i--) {
      for(int j = n; j >= i; j--) {
        System.out.print("* ");
      }
      
      int spaces = (i-1)*2;
      for(int j = 1; j <= spaces; j++) {
        System.out.print("  ");
      }
      for(int j = i; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    
    scanner.close();
  }
}