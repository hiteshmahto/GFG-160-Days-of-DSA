package Module_07_Two_Pointer_Technique.Day_60_Container_With_Most_Water;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[] = {2, 1, 8, 6, 4, 6, 5, 5};
        System.out.println(maxWater(arr));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int maxWater(int arr[]) {
        int maxWaterStored = Integer.MIN_VALUE;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            maxWaterStored = Math.max(maxWaterStored, (Math.min(arr[left], arr[right]) * (right - left)));
            if(arr[left] < arr[right]) left++;
            else right--;
        }
        return maxWaterStored;
    }
}
