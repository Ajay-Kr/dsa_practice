import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int org = sc.nextInt();


    // prime 
    // have exactly 2 factors 1 and itself
    int n = org;
    if(n < 2) {
      System.out.printf("%d : !Prime", n);
      return;
    }
    for ( int i = n-1; i >1; i--) {
      if(n%i == 0) {
        System.out.printf("%d : !Prime", n);
        return;
      }
    }

    System.out.printf("%d : Prime", n);

    sc.close();
  }
}