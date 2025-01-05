package Module_07_Two_Pointer_Technique.Day_52_Count_Pairs_whose_Sum_is_Less_than_Target;

import java.util.Arrays;

public class CountPairsWhoseSumLessThanTarget {
    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 8, 3, 4, 7, 2, 2, 4, 4, 6, 5};
        int target = 7;
        System.out.println(countPairs(arr, target));
    }

    // Time Complexity: O(n log(n))
    // Space Complexity: O(1)
    public static int countPairs(int arr[], int target) {
        int count = 0;
        int left = 0, right = arr.length - 1;
        Arrays.sort(arr);
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum >= target) right--;
            else {
                count += (right - left);
                left++;
            }
        }
        return count;
    }

}
