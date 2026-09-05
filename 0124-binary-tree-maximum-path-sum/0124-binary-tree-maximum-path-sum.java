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
    int p=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return p;
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int l=Math.max(0,dfs(root.left));
        int r=Math.max(0,dfs(root.right));
        p=Math.max(p,l+r+root.val);
        return Math.max(0,Math.max(l,r))+root.val;
    }
}