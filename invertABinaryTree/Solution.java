package invertABinaryTree;


class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

//class Solution {
//    public TreeNode swapNode(TreeNode root) {
//    	if(root==null) {
//    		return null;
////    		return ;
//    	}else {
//    	TreeNode tempNode = root.left;
//    	root.left = root.right;
//    	root.right = tempNode;
//    		
//    	}
//    	return root;
//    }
//    public TreeNode invertTree(TreeNode root) {
//    	if(root==null) {
//    		return root;
//    	}
//
//    	swapNode(root);
//    	
//    	invertTree(root.left);
//    	invertTree(root.right);
//    	return root;
//    }
//}
class Solution {
    public int maxDepth(TreeNode root) {
    	if(root==null) {
    		return 0;
    	}
    		return 1+ Math.max(maxDepth(root.right), maxDepth(root.left));
    	
    }
}
