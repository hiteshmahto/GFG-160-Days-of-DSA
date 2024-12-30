package Module_06_Hashing.Day_46_Union_of_Arrays_with_Duplicates;

import java.util.HashSet;

public class UnionOfArraysWithDuplicates {
    public static void main(String[] args) {
        int a[] = {85, 25, 1, 32, 54, 6};
        int b[] = {85, 2};
        System.out.println(findUnion(a, b));
    }

    // Time Complexity: O(n + m)
    // Space Complexity: O(n + m)
    public static int findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < a.length; i++) set.add(a[i]);
        for(int i = 0; i < b.length; i++) set.add(b[i]);
        return set.size();
    }
}
