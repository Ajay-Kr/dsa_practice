import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int init = n;
    int reverse = 0;
    while(n > 0) {
      int d = n % 10;
      reverse = reverse * 10 + d;
      n /= 10;
    }
    scanner.close();
    if(reverse != init) {
      System.out.println("false");
      return;
    }

    System.out.println("true");

  }
}