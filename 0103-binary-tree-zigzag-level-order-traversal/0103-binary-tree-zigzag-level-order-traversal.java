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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ans;
        q.offer(root);
        boolean a=false;
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode node=q.poll();
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
                l.add(node.val);
            }
            if(a==true){
                Collections.reverse(l);
                ans.add(l);
                a=false;
            }
            else{
                a=true;
                ans.add(l);
            }
        }
        return ans;
    }
}