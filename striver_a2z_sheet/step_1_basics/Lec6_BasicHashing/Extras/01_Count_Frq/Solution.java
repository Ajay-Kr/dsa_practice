/**
  * Count Frequency
  * Given an array of size N (numbers between 0 and 100), print the frequency of each number that appears at least once.
  * → Expected time O(N)
  */

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    // array size : between [0, 100] (inclusive)
    // example i/p arr of size 6 { 1, 2, 3, 1, 3, 4}
    //         o/p  1 -> 2
    //              2 -> 1
    //              3 -> 2
    //              4 -> 1

    // 1. Take the array size from user
    Scanner sc = new Scanner(System.in);
    final int size = sc.nextInt();

    // 2. Get the input array 
    int[] arr = new int[size];
    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    // 3. Make a hashing array
    // Max size can be 100 + 1
    int[] hash = new int[101];
    for(int i : arr) {
      hash[i] = hash[i] + 1;
    }

    // 4. Print the output
    for(int i = 0; i < hash.length; i++) {
      if(hash[i] <= 0) continue;

      System.out.printf("%d -> %d\n", i, hash[i]);
    }

    sc.close();
  }
}
