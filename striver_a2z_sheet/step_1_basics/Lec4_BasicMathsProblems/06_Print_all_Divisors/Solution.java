import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // 36
    // divisors = 1, 2, 3, 4, 6, 9, 12, 18, 36
    final int org = n;
    ArrayList<Integer> divisorArr = new ArrayList<>();
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        divisorArr.add(i);
        int divB = n/i;
        if(divB != i) {
          divisorArr.add(divB);
        }
      }
    }

    Collections.sort(divisorArr);
    System.out.printf("%d divisors : %s", org, Arrays.toString(divisorArr.toArray()));


    sc.close();
  }
}