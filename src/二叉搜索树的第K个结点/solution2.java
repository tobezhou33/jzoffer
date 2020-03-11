package 二叉搜索树的第K个结点;

import org.junit.Test;

public class solution2 {
    int index;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot != null){
            TreeNode node = KthNode(pRoot.left, k);
            if (node != null){
                return node;
            }
            index++;
            if (index == k){
                return pRoot;
            }
            node = KthNode(pRoot.right, k);
            if (node != null){
                return node;
            }
        }
        return null;

    }

    @Test
    public void test(){
        TreeNode r1= new TreeNode(8);
        TreeNode r2= new TreeNode(6);
        TreeNode r3= new TreeNode(10);
        TreeNode r4= new TreeNode(5);
        TreeNode r5= new TreeNode(7);
        TreeNode r6= new TreeNode(9);
        TreeNode r7= new TreeNode(11);

        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r2.right = r5;
        r3.left = r6;
        r3.right = r7;

        TreeNode treeNode = KthNode(r1, 2);
        System.out.println(treeNode.val);

    }
}
