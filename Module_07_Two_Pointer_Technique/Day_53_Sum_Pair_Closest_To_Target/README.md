# 🎯 Sum Pair Closest to Target

### 📝 Problem Statement

Given an array `arr[]` and a number `target`, find a pair of elements `(a, b)` in `arr[]`, where `a ≤ b` and their sum is closest to the target.

### 📌 Notes:

- Return the pair in **sorted order**.
- If there are **multiple pairs** closest to the target, return the pair with the **maximum absolute difference**.
- If **no such pair exists** (i.e., array has fewer than 2 elements), return an **empty array**.

---

### 🔑 Constraints

- `1 ≤ arr.size() ≤ 2 * 10^5`
- `0 ≤ target ≤ 2 * 10^5`
- `0 ≤ arr[i] ≤ 10^5`

---

### 🧩 Examples

#### Example 1:

**Input:**  
`arr[] = [10, 30, 20, 5]`  
`target = 25`

**Output:**  
`[5, 20]`

**Explanation:**  
The pair `(5, 20)` has a sum of `25`, which is closest to the target `25`.

---

#### Example 2:

**Input:**  
`arr[] = [5, 2, 7, 1, 4]`  
`target = 10`

**Output:**  
`[2, 7]`

**Explanation:**  
The pairs `(4, 7)` and `(2, 7)` both have sums closest to `10`.

- Absolute difference of `(2, 7)` is `5` and `(4, 7)` is `3`.
- Hence, return `[2, 7]` (maximum absolute difference).

---

#### Example 3:

**Input:**  
`arr[] = [10]`  
`target = 10`

**Output:**  
`[]`

**Explanation:**  
Since the array has only 1 element, a valid pair cannot be formed.

---

### ✅ Expected Complexity

- **Time Complexity:** `O(n log n)` (sorting the array + linear traversal).
- **Space Complexity:** `O(1)` (no extra space used).
