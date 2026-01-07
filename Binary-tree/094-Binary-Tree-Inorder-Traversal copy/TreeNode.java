
import java.util.ArrayList;
import java.util.List;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        result = inOrder(root, result);
        return result;
    }

    private List<Integer> inOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return null;
        }

        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);

        return result;

    }
}
