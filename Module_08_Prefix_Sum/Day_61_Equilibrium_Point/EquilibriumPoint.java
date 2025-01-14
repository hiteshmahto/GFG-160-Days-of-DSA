package Module_08_Prefix_Sum.Day_61_Equilibrium_Point;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int arr[] = {1, 7, 3, 6, 5, 6};
        System.out.println(findEquilibrium(arr));
    }

    // Time Complexity: O(2n)
    // Space Complexity: O(1)
    public static int findEquilibrium(int arr[]) {
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++) totalSum += arr[i];
        int currentSum = 0;
        for(int i = 0; i < arr.length; i++) {
            int leftSum = currentSum;
            int rightSum = totalSum - currentSum - arr[i];
            if(leftSum == rightSum) return i;
            currentSum += arr[i];
        }
        return -1;
    }
}
