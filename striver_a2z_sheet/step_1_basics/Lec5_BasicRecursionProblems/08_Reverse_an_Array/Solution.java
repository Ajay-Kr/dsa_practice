import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
  private static void recFunc(int[] arr, int start, int end) {
    if(start >= end) 
      return;
    
    final int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    recFunc(arr, start+1, end-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int len = sc.nextInt();
    final int[] arr = new int[len];

    for(int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.printf("arr\t=> %s\n", Arrays.toString(arr));

    recFunc(arr, 0, arr.length-1);

    System.out.printf("rev arr\t=> %s\n", Arrays.toString(arr));

    sc.close();
  }
}