package treeImplementing_learning2;

public class myBinaryTree {
	treeNode root;
	myBinaryTree(){
		
	}
	public void assiginingValue() {
		treeNode node0 = new treeNode(0);
		treeNode node1 = new treeNode(1);
		treeNode node2 = new treeNode(2);
		treeNode node3 = new treeNode(3);
		treeNode node4 = new treeNode(4);
		treeNode node5 = new treeNode(5);
		root = node0;
		node0.leftNode=node1;
		node0.rightNode=node2;
		node1.leftNode=node3;
		node1.rightNode=node4;
		node2.leftNode=node5;
		
	}

}
