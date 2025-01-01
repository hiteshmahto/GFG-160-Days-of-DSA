# 🔤 Anagram Checker

### 📝 Problem Statement

Given two strings `s1` and `s2` consisting of lowercase alphabets, the task is to determine whether the two strings are **anagrams** of each other.  
An anagram of a string is another string that contains the same characters, but the order of characters can be different.

For example:  
`"act"` and `"tac"` are anagrams of each other.

**Note:**

- Both strings `s1` and `s2` are non-empty.
- Strings contain only lowercase alphabets.

---

### 🔍 Examples

#### Example 1:

**Input:**  
`s1 = "geeks", s2 = "kseeg"`  
**Output:**  
`true`

**Explanation:**  
Both strings have the same characters with the same frequency, so they are anagrams.

---

#### Example 2:

**Input:**  
`s1 = "allergy", s2 = "allergic"`  
**Output:**  
`false`

**Explanation:**  
Characters in both strings are not the same, so they are not anagrams.

---

#### Example 3:

**Input:**  
`s1 = "g", s2 = "g"`  
**Output:**  
`true`

**Explanation:**  
Both strings have the same character, so they are anagrams.

---

### 📚 Constraints

- `1 ≤ s1.size(), s2.size() ≤ 10^5`
