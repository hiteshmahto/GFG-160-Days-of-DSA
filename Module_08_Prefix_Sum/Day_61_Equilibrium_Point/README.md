# ⚖️ Equilibrium Point

### 📝 Problem Statement

Given an array of integers `arr[]`, your task is to find the **first equilibrium point** in the array.  
An **equilibrium point** is an index (0-based) such that the **sum of all elements before it** is equal to the **sum of all elements after it**.

If no such point exists, return `-1`.

---

### 🔑 Constraints

- `3 ≤ arr.size() ≤ 10^6`
- `-10^9 ≤ arr[i] ≤ 10^9`

---

### 🧩 Examples

#### Example 1:

**Input:**  
`arr[] = [1, 2, 0, 3]`

**Output:**  
`2`

**Explanation:**

- Left sum of index `2`: `1 + 2 = 3`.
- Right sum of index `2`: `0 + 3 = 3`.

---

#### Example 2:

**Input:**  
`arr[] = [1, 1, 1, 1]`

**Output:**  
`-1`

**Explanation:**  
There is no index where the left sum equals the right sum.

---

#### Example 3:

**Input:**  
`arr[] = [-7, 1, 5, 2, -4, 3, 0]`

**Output:**  
`3`

**Explanation:**

- Left sum of index `3`: `-7 + 1 + 5 = -1`.
- Right sum of index `3`: `-4 + 3 + 0 = -1`.

---

### ✅ Expected Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`
