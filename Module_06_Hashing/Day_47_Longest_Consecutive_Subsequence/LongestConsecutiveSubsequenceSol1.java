package Module_06_Hashing.Day_47_Longest_Consecutive_Subsequence;

import java.util.Arrays;

public class LongestConsecutiveSubsequenceSol1 {
    public static void main(String[] args) {
        int arr[] = {15, 13, 12, 14, 11, 10, 9};
        System.out.println(longestConsecutive(arr));
    }

    // Time Complexity: O(n log n) + O(n)
    // Space Complexity: O(1)
    public static int longestConsecutive(int[] arr) {
        if(arr.length == 0) return 0;
        Arrays.sort(arr);
        int longestStreak = 1;
        int currentStreak = 1;
        int previousNum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == previousNum) continue;
            if(previousNum + 1 == arr[i]) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }
            longestStreak = Math.max(currentStreak, longestStreak);
            previousNum = arr[i];
        }

        return longestStreak;
    }
}
