package Module_07_Two_Pointer_Technique.Day_51_Count_All_Triplets_With_Given_Sum_in_Sorted_Array;

public class CountAllTripletsWithSumInSortedArray {
    static int globalCount = 0;
    public static void main(String[] args) {
        int arr[] = {-3, -1, -1, 0, 1, 2};
        int target = -2;
        System.out.println(countTriplets(arr, target));
    }
    
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int countTriplets(int[] arr, int target) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum > target) right--;
                else if(sum < target) left++;
                else {
                    int e1 = arr[left], e2 = arr[right], c1 = 0, c2 = 0;
                    while(left <= right && arr[left] == e1) {
                        c1++; left++;
                    }
                    while(left <= right && arr[right] == e2) {
                        c2++; right--;
                    }
                    if(e1 == e2) count += (c1 * (c1 - 1)) / 2;
                    else count += c1 * c2;
                    }
                }
            }
        return count;
    }
}
