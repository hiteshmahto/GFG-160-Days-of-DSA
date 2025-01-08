# 🔺 Count the Number of Possible Triangles

### 📝 Problem Statement

Given an integer array `arr[]`, determine the number of triangles that can be formed using three different elements of the array as the lengths of the triangle's sides.

### 📌 Notes:

A triangle is valid if and only if the **sum of any two sides is greater than the third side**.

---

### 🔑 Constraints

- `3 ≤ arr.size() ≤ 10^3`
- `1 ≤ arr[i] ≤ 10^5`

---

### 🧩 Examples

#### Example 1:

**Input:**  
`arr[] = [4, 6, 3, 7]`

**Output:**  
`3`

**Explanation:**  
The **3 valid triangles** are:

1. `[3, 4, 6]`
2. `[4, 6, 7]`
3. `[3, 6, 7]`

Note: `[3, 4, 7]` is not valid as `3 + 4 = 7`, which is not greater than `7`.

---

#### Example 2:

**Input:**  
`arr[] = [10, 21, 22, 100, 101, 200, 300]`

**Output:**  
`6`

**Explanation:**  
The **6 valid triangles** are:

1. `[10, 21, 22]`
2. `[21, 100, 101]`
3. `[22, 100, 101]`
4. `[10, 100, 101]`
5. `[100, 101, 200]`
6. `[101, 200, 300]`

---

#### Example 3:

**Input:**  
`arr[] = [1, 2, 3]`

**Output:**  
`0`

**Explanation:**  
No valid triangles can be formed.

---

### ✅ Expected Complexity

- **Time Complexity:** `O(n^2)` (nested loops after sorting).
- **Space Complexity:** `O(1)` (in-place computation).
