package Module_02_Strings.Day_16_Anagram;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";
        System.out.println(areAnagrams(s1, s2));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1) - as we only use a fixed-size frequency array
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] charCount = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] != 0) return false;
        }

        return true;
    }
}
