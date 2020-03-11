package 二叉树的深度;

public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root == null)return 0;
        int left = 0, right = 0;
        if(root.left != null)left = TreeDepth(root.left);
        if(root.right != null)right = TreeDepth(root.right);
        return Math.max(left, right)+1;
    }
}
