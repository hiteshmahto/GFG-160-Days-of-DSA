# 📏 Longest Subarray with Sum K

### 📝 Problem Statement

Given an array `arr[]` containing integers and an integer `k`, your task is to find the **length of the longest subarray** where the sum of its elements equals the given value `k`.

If no subarray with sum equal to `k` exists, return `0`.

---

### 🔑 Constraints

- `1 ≤ arr.size() ≤ 10^5`
- `-10^4 ≤ arr[i] ≤ 10^4`
- `-10^9 ≤ k ≤ 10^9`

---

### 🧩 Examples

#### Example 1:

**Input:**  
`arr[] = [10, 5, 2, 7, 1, -10]`  
`k = 15`

**Output:**  
`6`

**Explanation:**  
Subarrays with sum `15` are:

- `[10, 5]` (length = 2)
- `[5, 2, 7, 1]` (length = 4)
- `[10, 5, 2, 7, 1, -10]` (length = 6).

The longest subarray has a length of `6`.

---

#### Example 2:

**Input:**  
`arr[] = [-5, 8, -14, 2, 4, 12]`  
`k = -5`

**Output:**  
`5`

**Explanation:**  
Only subarray with sum `-5` is `[-5, 8, -14, 2, 4]` of length `5`.

---

#### Example 3:

**Input:**  
`arr[] = [10, -10, 20, 30]`  
`k = 5`

**Output:**  
`0`

**Explanation:**  
No subarray with sum `5` exists.

---

### ✅ Expected Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`
