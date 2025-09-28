import java.util.Scanner;

public class Solution {
  private static double recFunc(int n) {
    if(n == 1) {
      return 1;
    }
    return recFunc(n-1) * n;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();

    double fact = recFunc(n);
    System.out.printf("%d! = %.0f", n, fact);

    sc.close();
  }
}