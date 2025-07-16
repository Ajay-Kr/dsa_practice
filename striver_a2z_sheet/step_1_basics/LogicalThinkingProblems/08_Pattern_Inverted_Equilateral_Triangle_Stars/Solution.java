import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for(int i = n; i >= 1 ; i--) {
      for(int j = n; j >= 1; j--) {
        if(j > i) {
          System.out.print("   ");
        } else {
          System.out.print("  *");
        }
      }
      for(int j = 2; j <= n; j++) {
        if(j <= i) {
          System.out.print("  *");
        }
      }
      System.out.println();
    }

    scanner.close();
  }
}