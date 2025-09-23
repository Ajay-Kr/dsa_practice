import java.util.*;
public class Solution {
  public static void main(String[] args) {
    // 153 is armstrong
    // 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    final int org = n;
    int sum = 0;
    while (n > 0) {
      int digit = n%10;
      sum += digit * digit * digit;

      n = n/10;
    }
    // System.out.printf("n: %d | sum: %d", n, sum);
    System.out.println();
    if(sum == org) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    sc.close();
  }
}