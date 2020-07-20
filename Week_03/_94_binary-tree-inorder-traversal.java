import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;



class Solution{
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(stack.size() >0 || root != null ) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                TreeNode tmp = stack.pop();
                res.add(tmp.val);
                root = tmp.right;
            }

        }
        return res;




    }


}