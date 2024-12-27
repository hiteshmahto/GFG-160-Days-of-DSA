package Module_06_Hashing.Day_42_Two_Sum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int target = 16;
        System.out.println(twoSum(arr, target));
    }
    
    // without using map data structure
    // Time Complexity - O(n) + O(n log n)
    // Space Complexity - O(1)
    public static boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) return true;
            else if(sum > target) right--;
            else left++;
        }
        return false;
    }
    
    
    // using map data structure
    // Time Complexity - O(n)
    // Space Complexity - O(n)
    /*
    import java.util.HashMap;

    public static boolean twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int more = target - arr[i];
            if(map.containsKey(more)) return true;
            else map.put(arr[i], i);
        }
        return false;
    }
    */
}
