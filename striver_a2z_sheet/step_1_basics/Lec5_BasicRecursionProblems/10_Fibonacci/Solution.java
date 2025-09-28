import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  private static void recFunc(int[] arr, int count, int n) {
    if(count == n) {
      return;
    }
    if(count <= 1) {
      arr[count] = 1;
    } else {
      arr[count] = arr[count-1] + arr[count-2];
    }

    recFunc(arr, count+1, n);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();
    System.out.println("n -> "+ n);
    int[] arr = new int[n];

    recFunc(arr, 0, n);

    System.out.printf("fib => %s", Arrays.toString(arr));

    sc.close();
  }
}