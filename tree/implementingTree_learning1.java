package tree;

public class implementingTree_learning1 {
	class TreeNode{
		//create temp 
		public int value;
		public TreeNode leftNode;
		public TreeNode rightNode;
		public TreeNode(int value) {
			this.value=value;
		}
	}
	class myBinaryTree{
		private TreeNode root;
		public myBinaryTree(){
			
		}
		public void init() {
			TreeNode n0 = new TreeNode(0);
			TreeNode n1 = new TreeNode(1);
			TreeNode n2 = new TreeNode(2);
			TreeNode n3 = new TreeNode(3);
			TreeNode n4 = new TreeNode(4);
			TreeNode n5 = new TreeNode(5);
			
			root = n0;
			n0.leftNode=n1;n0.rightNode=n2;
			n1.leftNode=n3;n1.rightNode=n4;
			n2.rightNode=n5;
		}
	}
	public static void main(String[] args) {
		//testing function
		implementingTree_learning1 outerClassInstance = new implementingTree_learning1();
		myBinaryTree myTree = outerClassInstance.new myBinaryTree();
		myTree.init();
		System.out.println("Done");
		
	}
}
