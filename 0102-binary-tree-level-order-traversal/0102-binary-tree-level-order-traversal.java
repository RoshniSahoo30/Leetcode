/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res=new ArrayList<>();
        dfs(root,0,res);
        return res;
    }
    void dfs(TreeNode root, int lev, List<List<Integer>> res)
    {
        if(root==null)
        return;
        if(lev==res.size())
        {
            res.add(new ArrayList<>());
        }
        res.get(lev).add(root.val);

        dfs(root.left, lev+1, res);
        dfs(root.right, lev+1, res);
    }
}