⬅️ [Back to DSA Index](../../README.md)

# 📈 53. Maximum Subarray

**Difficulty:** 🟡 Medimum
**Topic:** Array, Dynamic Programming, Kadane’s Algorithm

---

## 📋 Problem Definition
Given an integer array `nums`, find the contiguous subarray (containing at least one number)  
which has the **largest sum** and return that sum.

---

## 🧠 Core Concept: Kadane’s Algorithm
This problem is solved using **Kadane’s Algorithm**, which is based on **Dynamic Programming**.

👉 Idea:
- At each index, decide whether to:
  - Start a new subarray
  - Or extend the existing subarray

---

## 🪜 Step-by-Step Approach

### 🔹 Initialization
- `currSum` → maximum subarray sum ending at current index
- `maxSoFar` → global maximum subarray sum

### 🔹 Iteration Logic
For each element:
1. Update `currSum` as the maximum of:
   - Current element alone
   - Current element + previous `currSum`
2. Update `maxSoFar` with the maximum value so far


---

## ⏱️ Complexity Analysis

### ⌛ Time Complexity
- **O(n)**  — The array is traversed only once.

### 💾 Space Complexity
- **O(n)**  — Only constant extra space is used.


---

## 🛠️ Java Implementation
```java
class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currSum);
        }

        return maxSoFar;
    }
}
