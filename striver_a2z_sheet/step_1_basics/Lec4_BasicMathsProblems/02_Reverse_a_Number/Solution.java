import java.util.Scanner;

public class Solution {
  public static int reverse(int x) {
      long reversedNum = 0;

      int tempX = x;

      while (tempX != 0) {
          int digit = tempX % 10;
          reversedNum = reversedNum * 10 + digit;
          tempX /= 10;
      }

      if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
          return 0;
      }

      return (int) reversedNum;
    }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int result = reverse(n);
    System.out.println(result == n);
    scanner.close();
  }
}