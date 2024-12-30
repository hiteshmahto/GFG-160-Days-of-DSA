# Union of Arrays with Duplicates 🔗

## Problem Statement 📋

Given two arrays `a[]` and `b[]`, the task is to find the **number of elements in the union** of these two arrays.

### Rules:

- The union of two arrays is the set containing **distinct elements** from both arrays.
- If there are repetitions, only one occurrence of each element should be considered in the union.

---

### Examples 🌟

#### Example 1:

**Input:**  
`a[] = [1, 2, 3, 4, 5]`  
`b[] = [1, 2, 3]`

**Output:**  
`5`

**Explanation:**  
The union of both arrays is `{1, 2, 3, 4, 5}`. The count of elements is `5`.

---

#### Example 2:

**Input:**  
`a[] = [85, 25, 1, 32, 54, 6]`  
`b[] = [85, 2]`

**Output:**  
`7`

**Explanation:**  
The union of both arrays is `{85, 25, 1, 32, 54, 6, 2}`. The count of elements is `7`.

---

#### Example 3:

**Input:**  
`a[] = [1, 2, 1, 1, 2]`  
`b[] = [2, 2, 1, 2, 1]`

**Output:**  
`2`

**Explanation:**  
The union of both arrays is `{1, 2}`. The count of elements is `2`.

---

### Constraints 🛑

- `1 ≤ a.size(), b.size() ≤ 10^6`
- `0 ≤ a[i], b[i] ≤ 10^5`
