# ✨ Count Pairs Whose Sum is Less Than Target

### 📝 Problem Statement

Given an array `arr[]` and an integer `target`, the task is to count the **number of pairs** `(i, j)` such that:

- `arr[i] + arr[j] < target`
- `i < j`

---

### 🧩 Examples

#### Example 1:

**Input:**  
`arr[] = [7, 2, 5, 3]`  
`target = 8`

**Output:**  
`2`

**Explanation:**  
The **2 pairs** with sum less than `8` are:

1. `(2, 5)`
2. `(2, 3)`

---

#### Example 2:

**Input:**  
`arr[] = [5, 2, 3, 2, 4, 1]`  
`target = 5`

**Output:**  
`4`

**Explanation:**  
The **4 pairs** with sum less than `5` are:

1. `(2, 2)`
2. `(2, 1)`
3. `(3, 1)`
4. `(2, 1)`

---

#### Example 3:

**Input:**  
`arr[] = [2, 1, 8, 3, 4, 7, 6, 5]`  
`target = 7`

**Output:**  
`6`

**Explanation:**  
The **6 pairs** with sum less than `7` are:

1. `(2, 1)`
2. `(2, 3)`
3. `(2, 4)`
4. `(1, 3)`
5. `(1, 4)`
6. `(1, 5)`

---

### 🔑 Constraints

- `1 ≤ arr.size() ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^4`
- `1 ≤ target ≤ 10^4`

---

### ✅ Expected Complexity

- **Time Complexity:** `O(n log n)` (sorting the array + linear traversal).
- **Space Complexity:** `O(1)` (no extra space used).
