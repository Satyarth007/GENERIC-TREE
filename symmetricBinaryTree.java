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
     public boolean isSymmetric(TreeNode root) {
         TreeNode p=root,q=root;
         return check(p,q);
    }
    boolean check(TreeNode p, TreeNode q){
        Boolean ans1=true, ans2=true;
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        while(p!=null && q!=null){
            if(p.val!=q.val) return false;
            ans1=check(p.left,q.right);
            ans2=check(p.right,q.left);
            if(!ans1 || !ans2) return false;
            else return true;
        }
        return true;
    }
}
