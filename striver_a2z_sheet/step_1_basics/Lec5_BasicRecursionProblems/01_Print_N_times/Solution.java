import java.util.Scanner;

public class Solution {
  static void recFunc(int i, int n) {
    if(i <= n) {
      System.out.printf("%d. Name", i);
      System.out.println();
      recFunc(i+1, n);
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    recFunc(1, n);

    scanner.close();
  }  
}
