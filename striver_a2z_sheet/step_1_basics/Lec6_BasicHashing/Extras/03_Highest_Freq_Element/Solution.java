/**
 * Highest Frequency Element
 * Find the integer that appears the maximum number of times.
 */

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    // array size : between [0, 100]

    Scanner sc = new Scanner(System.in);
    // 1. get array from user
    final int size = sc.nextInt();
    int[] arr = new int[size];
    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    // 2. hash
    int[] hash = new int[101];
    for(int i : arr) {
      hash[i] = hash[i] + 1;
    }

    // 3. get the output
    int maxFrq = -1;
    int maxFrqElm = 0;
    for(int i = 0; i < hash.length; i++) {
      if(hash[i] > maxFrq) {
        maxFrq = hash[i];
        maxFrqElm = i;
      }
    }

    System.out.printf("Max frq : %d -> %d", maxFrqElm, maxFrq);

    sc.close();
  }
}
