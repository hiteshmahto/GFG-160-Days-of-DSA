package Module_06_Hashing.Day_47_Longest_Consecutive_Subsequence;

import java.util.HashSet;

public class LongestConsecutiveSubsequenceSol2 {
    public static void main(String[] args) {
        int arr[] = {15, 13, 12, 14, 11, 10, 9};
        System.out.println(longestConsecutive(arr));
    }

    // Time Complexity: O(n) + O(n)
    // Space Complexity: O(n)
    public static int longestConsecutive(int[] arr) {
        if(arr.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) set.add(arr[i]);

        int longestStreak = 1;
        for(int num : set) {
            if(!set.contains(num - 1)) {
                int currentStreak = 1;
                int currentNum = num;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(currentStreak, longestStreak);
            }
        }
        return longestStreak;
    }
}
