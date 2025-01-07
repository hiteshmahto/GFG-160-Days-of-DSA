# 🔗 Pair with Given Sum in a Sorted Array

### 📝 Problem Statement

You are given an integer `target` and an array `arr[]`. The task is to find the **number of pairs** in `arr[]` that sum up to the target.

### 📌 Notes:

- Each pair must consist of elements from **distinct indices**.
- The elements in `arr[]` are sorted in **non-decreasing order**.

---

### 🔑 Constraints

- `-10^5 ≤ target ≤ 10^5`
- `2 ≤ arr.size() ≤ 10^5`
- `-10^5 ≤ arr[i] ≤ 10^5`

---

### 🧩 Examples

#### Example 1:

**Input:**  
`arr[] = [-1, 1, 5, 5, 7]`  
`target = 6`

**Output:**  
`3`

**Explanation:**  
The **3 pairs** that sum up to `6` are:

1. `(1, 5)`
2. `(1, 5)`
3. `(-1, 7)`

---

#### Example 2:

**Input:**  
`arr[] = [1, 1, 1, 1]`  
`target = 2`

**Output:**  
`6`

**Explanation:**  
The **6 pairs** that sum up to `2` are:

1. `(1, 1)`
2. `(1, 1)`
3. `(1, 1)`
4. `(1, 1)`
5. `(1, 1)`
6. `(1, 1)`

---

#### Example 3:

**Input:**  
`arr[] = [-1, 10, 10, 12, 15]`  
`target = 125`

**Output:**  
`0`

**Explanation:**  
There is **no pair** whose sum equals `125`.

---

### ✅ Expected Complexity

- **Time Complexity:** `O(n)` (linear traversal using two pointers).
- **Space Complexity:** `O(1)` (no extra space used).
