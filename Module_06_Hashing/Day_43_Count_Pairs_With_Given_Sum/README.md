# Count Pairs with Given Sum 🎯

## Problem Statement 📋

Given an array `arr[]` and an integer `target`, find the **number of pairs** in the array that sum up to the given `target`.

---

### Examples 🌟

#### Example 1:

**Input:**  
`arr[] = [1, 5, 7, -1, 5]`  
`target = 6`

**Output:**  
`3`

**Explanation:**  
Pairs with sum `6` are:

- `(1, 5)`
- `(7, -1)`
- `(1, 5)` (repeated pair)

---

#### Example 2:

**Input:**  
`arr[] = [1, 1, 1, 1]`  
`target = 2`

**Output:**  
`6`

**Explanation:**  
Pairs with sum `2` are:

- `(1, 1)` (repeated 6 times)

---

#### Example 3:

**Input:**  
`arr[] = [10, 12, 10, 15, -1]`  
`target = 125`

**Output:**  
`0`

**Explanation:**  
No pairs sum up to `125`.

---

### Constraints 🛑

- `1 ≤ arr.size() ≤ 10^5`
- `-10^4 ≤ arr[i] ≤ 10^4`
- `1 ≤ target ≤ 10^4`
