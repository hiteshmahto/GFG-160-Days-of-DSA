package Module_07_Two_Pointer_Technique.Day_54_Pair_With_Given_Sum_In_a_Sorted_Array;

public class PairWithGivenSumInSortedArray {
    public static void main(String[] args) {
        int arr[] = {-1, 1, 5, 5, 7};
        int target = 6;
        System.out.println(countPairs(arr, target));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int countPairs(int arr[], int target) {
        int count = 0;
        int left = 0, right = arr.length - 1;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum > target) right--;
            else if(sum < target) left++;
            else {
                int e1 = arr[left], e2 = arr[right];
                int c1 = 0, c2 = 0;
                while (e1 == arr[left] && left <= right) {
                    left++; c1++;
                }
                while(e2 == arr[right] && left <= right) {
                    right--; c2++;
                }
                if(e1 == e2) count += (c1 * (c1 - 1)) / 2 ;
                else count += c1 * c2;
            }
        }
        return count;
    }
}
