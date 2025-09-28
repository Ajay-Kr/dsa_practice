import java.util.Scanner;

public class Solution {
  private static void recFunc(char[] arr, int start, int end) {
    if(start >= end) {
      return;
    }

    final char temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    recFunc(arr, start+1, end-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final String str = sc.nextLine();

    final char[] strArr = str.toCharArray();
    recFunc(strArr, 0, strArr.length-1);

    System.out.printf("rev str => %s", new String(strArr));

    sc.close();
  }
}