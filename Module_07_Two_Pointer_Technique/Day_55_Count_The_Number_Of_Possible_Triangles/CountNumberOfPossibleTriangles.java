package Module_07_Two_Pointer_Technique.Day_55_Count_The_Number_Of_Possible_Triangles;

import java.util.Arrays;

public class CountNumberOfPossibleTriangles {
    public static void main(String[] args) {
        int arr[] = {10, 21, 22, 100, 101, 200, 300};
        System.out.println(countTriangles(arr));
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int countTriangles(int arr[]) {
        int count = 0;
        Arrays.sort(arr);
        for(int i = arr.length - 1; i >= 2; i--) {
            int left = 0, right = i - 1;
            while (left < right) {
                if(arr[left] + arr[right] > arr[i]) {
                    count += right - left;
                    right--;
                } else left++;
            }
        }
        return count;
    }
}
