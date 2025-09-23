import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n1 = scanner.nextInt();
    final int n2 = scanner.nextInt();
    int a = n1;
    int b = n2;

    int min = Math.min(a,b);
    int gcd=1;
    // METHOD 1
    for(int i = min; i > 1; i--) {
      if((a % i == 0) && (b%i==0)) {
        gcd = i;
        break;
      }
    }
    System.out.printf("gcd(%d, %d) => %d", a, b, gcd);
    System.out.println();
    // METHOD 2 - OPTIMISED

    gcd = 1;
    while ( (a > 0) && (b > 0)) {
      if(a > b) {
        a = a % b;
      } else if(b > a) {
        b = b % a;
      }
    }
    if(a == 0) {
      gcd = b;
    } else if(b == 0) {
      gcd = a;
    }
    System.out.printf("gcd(%d, %d) -> %d", n1, n2, gcd);

    scanner.close();
  }
}