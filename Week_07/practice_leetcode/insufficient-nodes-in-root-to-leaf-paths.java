import javax.swing.tree.TreeNode;

class Solution{
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if (root == null) {
            reutrn null;
        }
        if (root.left == root.right) {
            if (root.val < limit) {
                return null;
            }
            return root;
        }
        root.left = sufficientSubset(root.left, limit - root.val);
        root.right = sufficientSubset(root.right, limit - root.val);
        if (root.left == null && root.right == null) {
            return null;
        }
        return root;
    }


}