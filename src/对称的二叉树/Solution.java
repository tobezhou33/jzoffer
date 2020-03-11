package 对称的二叉树;

public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        return is(pRoot,pRoot);
    }
    boolean is(TreeNode p1,TreeNode p2){
        if(p1 == null && p2 ==null)return true;

        if(p1 == null || p2 == null)return false;
        if(p1.val != p2.val )return false;
        return is(p1.left, p2.right)&& is(p1.right, p2.left);
    }
}
