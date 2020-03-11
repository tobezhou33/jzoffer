package 重建二叉树;

import java.util.HashMap;

public class Solution {
    private HashMap<Integer, Integer>orderIndex = new HashMap<>();

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null||in == null)return null;
        for(int i = 0; i < in.length; i++){
            orderIndex.put(in[i], i);
        }
        return reConstructBinaryTree(pre,0, pre.length -1 , 0);
    }

    public TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL){
        if(preL > preR){
            return null;
        }
        TreeNode root = new TreeNode(pre[preL]);
        int index = orderIndex.get(root.val);
        int leftLength = index - inL;
        root.left = reConstructBinaryTree(pre, preL+1, preL+leftLength, inL);
        root.right = reConstructBinaryTree(pre, preL+1+leftLength, preR, index+1);
        return root;
    }
}
