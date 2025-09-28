import java.util.Scanner;

public class Solution {
  private static void recFunc(int i, int n) {
    if(i > n) {
      return;
    }

    System.out.println(i);
    recFunc(i + 1, n);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();

    recFunc(1, n);

    sc.close();
  }
}