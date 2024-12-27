package Module_06_Hashing.Day_43_Count_Pairs_With_Given_Sum;

import java.util.HashMap;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {5, 8, 7, 5, 7, 6};
        int target = 13;
        System.out.println(countPairs(arr, target));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            int more = target - arr[i];
            count += freqMap.getOrDefault(more, 0);
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }
}
