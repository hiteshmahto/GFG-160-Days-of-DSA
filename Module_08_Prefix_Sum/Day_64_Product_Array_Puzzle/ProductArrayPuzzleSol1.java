package Module_08_Prefix_Sum.Day_64_Product_Array_Puzzle;

import java.util.Arrays;

public class ProductArrayPuzzleSol1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    // Time Complexity: O(3n) --> O(n)
    // Space Complexity: O(2n) --> O(n)
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;

        // prefix array
        int prefix[] = new int[n];
        prefix[0] = 1;
        for(int i = 1; i < n; i++) {
            prefix[i] = arr[i - 1] * prefix[i - 1];
        }
        
        // suffix array
        int suffix[] = new int[n];
        suffix[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--) {
            suffix[i] = arr[i + 1] * suffix[i + 1];
        }


        // calculating result
        int result[] = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}
