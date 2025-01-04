# 🚀 Count All Triplets with Given Sum in Sorted Array

### 📝 Problem Statement

Given a **sorted array** `arr[]` and a **target value**, the task is to count **triplets** `(i, j, k)` of valid indices such that:

- `arr[i] + arr[j] + arr[k] = target`
- `i < j < k`

---

### 🧩 Examples

#### Example 1:

**Input:**  
`arr[] = [-3, -1, -1, 0, 1, 2]`  
`target = -2`

**Output:**  
`4`

**Explanation:**  
The **4 triplets** that add up to `-2` are:

1. `arr[0] + arr[3] + arr[4] = (-3) + 0 + (1) = -2`
2. `arr[0] + arr[1] + arr[5] = (-3) + (-1) + (2) = -2`
3. `arr[0] + arr[2] + arr[5] = (-3) + (-1) + (2) = -2`
4. `arr[1] + arr[2] + arr[3] = (-1) + (-1) + (0) = -2`

---

#### Example 2:

**Input:**  
`arr[] = [-2, 0, 1, 1, 5]`  
`target = 1`

**Output:**  
`0`

**Explanation:**  
There is **no triplet** whose sum is equal to `1`.

---

### 🔑 Constraints

- `3 ≤ arr.size() ≤ 10^4`
- `-10^5 ≤ arr[i], target ≤ 10^5`
- The input array is **sorted** in non-decreasing order.

---

### ✅ Expected Complexity

- **Time Complexity:** `O(n^2)` where `n` is the size of the array.
- **Space Complexity:** `O(1)` (no extra space used).
