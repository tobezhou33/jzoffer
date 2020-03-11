package 二叉树中和为某一值的路径;

import java.util.ArrayList;

public class Solution {
    private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        back(root, target, new ArrayList<>());
        return ret;
    }
    public void back(TreeNode root, int target, ArrayList<Integer> path){
        if(root == null)
            return;
        path.add(root.val);
        target -= root.val;
        if(target== 0&& root.left == null && root.right == null){
            ret.add(new ArrayList<>(path));
        }else {
            back(root.left, target, path);
            back(root.right, target, path);
        }
        path.remove(path.size() - 1);
    }
}
