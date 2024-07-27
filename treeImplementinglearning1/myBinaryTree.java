package treeImplementinglearning1;

public class myBinaryTree {
	//Store all Node
	//Luon luon phai co root 
	private treeNode root;
	public myBinaryTree() {
		
	}
	public void assignValue() {
		treeNode n0 = new treeNode(0);
		treeNode n1 = new treeNode(1);
		treeNode n2 = new treeNode(2);
		treeNode n3 = new treeNode(3);
		treeNode n4 = new treeNode(4);
		treeNode n5 = new treeNode(5);
		root = n0;
		n0.leftNode=n1;n0.rightNode=n2;
		n1.leftNode=n3;n1.rightNode=n4;
		n2.rightNode=n5;
	}
	

}
