class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
       if(root1==null&&root2==null){
        return null;
       }
       if(root1==null || root2==null){
        return root1==null?root2:root1;
       }
       TreeNode res=new TreeNode(root1.val+root2.val);
       res.left=mergeTrees(root1.left,root2.left);
       res.right=mergeTrees(root1.right,root2.right);
       return res;
    }
}