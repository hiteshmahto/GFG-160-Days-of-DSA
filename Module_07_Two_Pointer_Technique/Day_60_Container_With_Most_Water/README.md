# 🛢️ Container With Most Water

### 📝 Problem Statement

You are given an array `arr[]` of non-negative integers, where each element `arr[i]` represents the height of a vertical line.  
Find the **maximum amount of water** that can be contained between any two lines, together with the x-axis.

### 📌 Notes:

- Water can only be held if there are at least **two vertical lines**.
- The area of water contained is calculated as:  
  `Area = min(height[i], height[j]) * (j - i)`  
  Where `i` and `j` are the indices of the two lines.

---

### 🔑 Constraints

- `1 ≤ arr.size() ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^4`

---

### 🧩 Examples

#### Example 1:

**Input:**  
`arr[] = [1, 5, 4, 3]`

**Output:**  
`6`

**Explanation:**  
The **two lines** are at indices `1` and `3`:

- Distance between lines = `3 - 1 = 2`.
- Height of the container = `min(5, 3) = 3`.
- Total water area = `2 * 3 = 6`.

---

#### Example 2:

**Input:**  
`arr[] = [3, 1, 2, 4, 5]`

**Output:**  
`12`

**Explanation:**  
The **two lines** are at indices `0` and `4`:

- Distance between lines = `4 - 0 = 4`.
- Height of the container = `min(3, 5) = 3`.
- Total water area = `4 * 3 = 12`.

---

#### Example 3:

**Input:**  
`arr[] = [2, 1, 8, 6, 4, 6, 5, 5]`

**Output:**  
`25`

**Explanation:**  
The **two lines** are at indices `2` and `7`:

- Distance between lines = `7 - 2 = 5`.
- Height of the container = `min(8, 5) = 5`.
- Total water area = `5 * 5 = 25`.

---

### ✅ Expected Complexity

- **Time Complexity:** `O(n)` (single traversal of the array).
- **Space Complexity:** `O(1)` (no extra space required).
