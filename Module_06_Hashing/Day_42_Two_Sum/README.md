# Two Sum - Pair with Given Sum ✨

## Problem Statement 📋

Given an array `arr[]` of positive integers and another integer `target`, determine if there exist **two distinct indices** such that the sum of their elements equals the `target`.

---

### Examples 🌟

#### Example 1:

**Input:**  
`arr[] = [1, 4, 45, 6, 10, 8]`  
`target = 16`

**Output:**  
`true`

**Explanation:**  
`arr[3] + arr[4] = 6 + 10 = 16`

---

#### Example 2:

**Input:**  
`arr[] = [1, 2, 4, 3, 6]`  
`target = 11`

**Output:**  
`false`

**Explanation:**  
None of the pairs make a sum of `11`.

---

#### Example 3:

**Input:**  
`arr[] = [11]`  
`target = 11`

**Output:**  
`false`

**Explanation:**  
No pair is possible as only one element is present in `arr[]`.

---

### Constraints 🛑

- `1 ≤ arr.size ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^5`
- `1 ≤ target ≤ 2 × 10^5`
