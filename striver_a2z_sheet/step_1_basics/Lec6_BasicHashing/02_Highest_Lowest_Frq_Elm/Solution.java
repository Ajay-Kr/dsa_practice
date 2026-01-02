import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Solution {
  private static void highestLowestFrq(int[] arr) {
    List<List<Integer>> frq = new ArrayList<>();


    int highest=0;
    int lowest=0;
    System.out.printf("Highest: %d \nLowest : $d", highest, lowest);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();
    final int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for(int i : arr) {
      System.out.println(i);
    }

    highestLowestFrq(arr);

    sc.close();
  }
}