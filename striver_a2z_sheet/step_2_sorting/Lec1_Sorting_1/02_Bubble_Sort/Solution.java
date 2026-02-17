import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Solution {
  static void printArray(List<Integer> arr) {
    System.out.print("[");
    for(int elm: arr) {
      System.out.printf(" %d ", elm);
    }
    System.out.println("]");
  }
  static void bubbleSort(List<Integer> arr) {
    // MOVES NTH LARGEST TO CORRECT PLACE IN NTH LOOP
    for(int i = 0; i < arr.size(); i++) {
      for(int j = 1; j < arr.size()-i; j++) {
        if(arr.get(j-1) > arr.get(j)) {
          Collections.swap(arr, j-1, j);
        }
      }
    }
  }
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of inputs: ");
    int numOfElm = sc.nextInt();

    if(numOfElm <= 0) {
      System.out.println("Array size must be positive.");
      sc.close();
      return;
    }

    System.out.println("Enter array elements: ");
    for(int i = 0; i < numOfElm; i++) {
      int elm = sc.nextInt();
      arr.add(elm);
    }

    System.out.println("input array: ");
    printArray(arr);
    bubbleSort(arr);
    System.out.println("sorted array: ");
    printArray(arr);
    sc.close();
  }
}
