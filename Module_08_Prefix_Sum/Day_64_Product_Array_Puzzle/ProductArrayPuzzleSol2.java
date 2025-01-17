package Module_08_Prefix_Sum.Day_64_Product_Array_Puzzle;

import java.util.Arrays;

public class ProductArrayPuzzleSol2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    // Time Complexity: O(2n) --> O(n)
    // Space Complexity: O(1)
    public static int[] productExceptSelf(int arr[]) {
        int result[] = new int[arr.length];
        int prefix = 1, suffix = 1;

        // prefix
        result[0] = 1;
        for(int i = 1; i < arr.length; i++) {
            prefix *= arr[i - 1];
            result[i] = prefix;
        }

        // suffix
        for(int i = arr.length - 2; i >= 0; i--) {
            suffix *= arr[i + 1];
            result[i] *= suffix;
        }

        return result;
    }
}
