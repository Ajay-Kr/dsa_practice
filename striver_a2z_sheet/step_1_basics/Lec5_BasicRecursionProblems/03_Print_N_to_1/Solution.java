import java.util.Scanner;

public class Solution {
  private static void recFunc(int n) {
    if(n >= 1 ) {
      System.out.println(n);
      recFunc(n - 1);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();

    recFunc(n);
    sc.close();
  }
}