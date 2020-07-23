class Solution{ 
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //判读根 左 右
        if (root == null || root == p || root == q) return root;
        //递归左子树
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        //递归右子树
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //判断递归后的左子树
        if (left == null) return right;
        //判断递归后的右子树
        if (right == null ) return left;
        //最终返回
        return root;

    }
}