package Module_07_Two_Pointer_Technique.Day_53_Sum_Pair_Closest_To_Target;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumPairClosestToTarget {
    public static void main(String[] args) {
        int arr[] = {3, 0, 17};
        int target = 10;
        System.out.println(sumClosest(arr, target));
    }

    // Time Complexity: O(n log(n))
    // Space Complexity: O(1)
    public static List<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> result = new ArrayList<>();
        int left = 0, right = arr.length - 1;
        int closestDiff = Integer.MAX_VALUE;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(Math.abs(target - sum) < closestDiff) {
                closestDiff = Math.abs(target - sum);
                result.clear();
                result.add(arr[left]);
                result.add(arr[right]);
            }
            if(sum == target) return result;
            else if(sum > target) right--;
            else left++;
        }
        return result;
    }
}