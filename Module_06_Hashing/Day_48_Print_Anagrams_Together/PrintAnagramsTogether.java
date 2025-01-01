package Module_06_Hashing.Day_48_Print_Anagrams_Together;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintAnagramsTogether {
    public static void main(String[] args) {
        String arr[] = {"act", "god", "cat", "dog", "tac"};
        System.out.println(anagrams(arr));
    }

    // Time Complexity: O(n * k) -- `n` is length of `arr` and `k` is the average length of each string
    // Space Complexity: O(S) -- S is the total length of all input strings
    public static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int[] freq = new int[26];
            String currentWord = arr[i];
            for (char ch : currentWord.toCharArray()) {
                freq[ch - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int count : freq) {
                keyBuilder.append(count).append('#');
            }
            String key = keyBuilder.toString();
            
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(currentWord);
        }
        
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for (ArrayList<String> group : map.values()) {
            result.add(group);
        }
        
        return result;
    }
}
