package Module_08_Prefix_Sum.Day_62_Longest_Subarray_with_Sum_K;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int arr[] = {-5, 8, -14, 2, 4, 12};
        int k = -5;
        System.out.println(longestSubarray(arr, k));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int longestSubarray(int[] arr, int k) {
        int maxLength = 0, sum = 0;
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum == k) maxLength = Math.max(maxLength, i + 1);

            if(preSumMap.containsKey(sum - k))
                maxLength = Math.max(maxLength, preSumMap.get(sum - k));

            if(!preSumMap.containsKey(sum))
                preSumMap.put(sum, i);
        }
        return maxLength;
    }
}
