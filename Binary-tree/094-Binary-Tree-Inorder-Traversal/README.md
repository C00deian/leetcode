⬅️ [Back to DSA Index](../../README.md)

# 🌳 94. Binary Tree Inorder Traversal

**Difficulty:** 🟢 Easy
**Topic:**    Stack, Tree, Depth-First Search, Binary Tree

---

## 📋 Problem Definition
Given the root of a binary tree, return the inorder traversal of its nodes' values.

---

## 🔍 What is Inorder Traversal?
In inorder traversal, nodes are visited in the following order:

- ➡️ Left Subtree
- ➡️ Root Node
- ➡️ Right Subtree

📌 **Important Note:**  
If the tree is a **Binary Search Tree (BST)**, inorder traversal always returns values in **sorted (ascending) order**.

---

## 🧠 Core Concept: Recursion + DFS
This problem uses **Depth First Search (DFS)** with recursion.

👉 Since a binary tree is recursive by nature, we solve the problem for one node and let recursion handle the rest.

---

## 🪜 Step-by-Step Approach

### 🔹 Base Case
❌ If the current node is `null`, return (stop recursion).

### 🔹 Recursive Step 1
⬅️ Traverse the left subtree.

### 🔹 Process Current Node
📝 Add `root.val` to the result list.

### 🔹 Recursive Step 2
➡️ Traverse the right subtree.

---

## ⏱️ Complexity Analysis

### ⌛ Time Complexity
- **O(n)** — Every node is visited exactly once.

### 💾 Space Complexity
- **O(n)** — Worst case (skewed tree)
- **O(log n)** — Balanced tree (due to recursion stack)


## 🛠️ Java Implementation
```java
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }
}
