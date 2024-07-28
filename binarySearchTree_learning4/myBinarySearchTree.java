package binarySearchTree_learning4;

public class myBinarySearchTree {
	public treeNode mRoot;
	public myBinarySearchTree(){
		
	}
	//implementing insert function
	public treeNode insert(treeNode root,int value) {
		if(root==null) {
			root = new treeNode(value);
			return root;
		}else {
			treeNode tempNode = root;
			while(true) {
				if(value>tempNode.value) {
					if(tempNode.rightNode==null) {
						tempNode.rightNode=new treeNode(value);
						break;
					}else {
						tempNode = tempNode.rightNode; 
					}
				}else {
					if(tempNode.leftNode==null) {
						tempNode.leftNode=new treeNode(value);
						break;
					}else {
						tempNode = tempNode.leftNode;
					}
					 
				}
				 
			}
			return root;
		}
		
//		return null;
	}

}
