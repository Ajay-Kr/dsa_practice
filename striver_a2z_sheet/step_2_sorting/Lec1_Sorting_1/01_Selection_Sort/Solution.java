import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
  static void swapArrayIndices(List<Integer> arr, int i, int j) {
    if(i < 0 || j < 0 || i >= arr.size() || j >= arr.size()) {
      System.out.printf("Invalid i(%d) or j(%d) for array size %d\n", i, j, arr.size());
      return;
    }

    Integer temp = arr.get(i);
    arr.set(i, arr.get(j));
    arr.set(j, temp);

    // inbuilt
    Collections.swap(arr, i, j);
  }

  static int getArrayMinElmIdx(List<Integer> arr, int start, int end) {
    if(start < 0 || end > arr.size() || start >= end) {
      System.out.printf("Invalid start(%d) or end(%d) for array size %d\n", start, end, arr.size());
      return -1;
    }

    // System.out.println("Inputs: ");
    // printArray(arr);
    // System.out.printf("start: %d | end: %d\n", start, end);

    int minElmIdx = start;
    for(int i = start+1; i < end; i++) {
      if(arr.get(i) < arr.get(minElmIdx)) {
        minElmIdx = i;
      }
    }
    // System.out.printf("minidx = %d | minElm = %d\n\n", minElmIdx, arr.get(minElmIdx));
    return minElmIdx;
  }

  static void printArray(List<Integer> arr) {
    System.out.print("[");
    for(int i = 0; i < arr.size(); i++) {
      System.out.printf("  %d  ", arr.get(i));
    }
    System.out.println("]");
  }

  static void selectionSort(List<Integer> arr) {
    for(int i = 0; i < arr.size(); i++) {
      final int minElmIdx = getArrayMinElmIdx(arr, i, arr.size());
      if(minElmIdx == -1 ) continue;
      if(i == minElmIdx) continue;
      swapArrayIndices(arr, i, minElmIdx);
    }
  } 
  public static void main(String args[]) {
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
    selectionSort(arr);
    System.out.println("sorted array: ");
    printArray(arr);
    sc.close();
  }  
}
