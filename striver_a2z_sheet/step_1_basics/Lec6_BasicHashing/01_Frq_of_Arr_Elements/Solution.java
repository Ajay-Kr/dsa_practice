import java.util.Scanner;
import java.util.List;
import java.lang.Integer;
import java.util.ArrayList;

public class Solution {
  public static List<List<Integer>> countFrequency(int[] nums) {
    List<List<Integer>> freq = new ArrayList<>();
    List<Integer> seen = new ArrayList<>();
    for(int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if(!seen.contains(num)) {
        seen.add(num);
        List<Integer> frqArr = new ArrayList<>();
        frqArr.add(num);
        frqArr.add(1);
        freq.add(frqArr);
      } else {
        int index = seen.indexOf(num);
        Integer numFrq = freq.get(index).get(1);
        freq.get(index).set(1, numFrq+1);
      }
    }
    
    return freq;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    final int[] nums = new int[n];
    for(int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }

    List<List<Integer>> out = countFrequency(nums);

    System.out.println(out);

    scanner.close();
  }  
}
