import java.util.Scanner;

public class Solution {
  private static int recFunc(int n) {
    if(n == 0) {
      return 0;
    }
    return recFunc(n-1) + n;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();

    int sum = recFunc(n);
    System.out.printf("sum => %d", sum);

    sc.close();
  }
}