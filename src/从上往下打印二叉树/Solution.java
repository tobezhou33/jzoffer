package 从上往下打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer>ret = new ArrayList<>();
        if(root == null)
            return ret;
        queue.add(root);
        while(!queue.isEmpty()){
            int cnt = queue.size();
            while(cnt -- > 0){
                TreeNode t = queue.poll();
                ret.add(t.val);
                if(t.left != null)queue.add(t.left);
                if(t.right!= null)queue.add(t.right);
            }

        }
        return ret;
    }
}
