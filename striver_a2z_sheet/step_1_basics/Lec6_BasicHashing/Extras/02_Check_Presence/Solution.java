/**
 * Check Presence
 * Given Q queries, each asking “Is X present in the array?”, answer using array-based hashing.
 * Input :  arr = [2, 4, 4, 6, 8]
 *          queries = [4, 5, 8]
 * Output:  4 → Yes
 *          5 → No
 *          8 → Yes
 */
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    // array size : between [0, 100]
    // since only presence is asked thus boolean hash can be used

    // 1. get the array 
    Scanner sc = new Scanner(System.in);
    final int size = sc.nextInt();
    int[] arr = new int[size];
    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    // 2. initialize boolean hash for size + 1
    boolean[] boolHash = new boolean[101];
    // 3. hash the values
    for(int i : arr) {
      boolHash[i] = true;
    }

    // 4. get queries array
    final int querySize = sc.nextInt();
    int[] queries = new int[querySize];
    for(int i = 0; i < querySize; i++) {
      queries[i] = sc.nextInt();
    }

    // 4. print the output
    for(int query : queries) {
      System.out.printf("%d -> %b\n", query, boolHash[query]);
    }

    sc.close();
  }
}
