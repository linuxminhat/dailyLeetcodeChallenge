package binarySearchTree_learning2;

public class myBinarySearchTree {
	//always declare a root 
	public treeNode mRoot;
	public myBinarySearchTree() {
		
		
	}
	public treeNode insert(treeNode root,int value) {
		//Case1 : root == null
		if(root==null) {
			root = new treeNode(value);
			return root;
		}else {
			//Case2 : root !=null
			treeNode tempNode = root;
			while(true) {
				if(value>tempNode.value) {
					if(tempNode.rightNode!=null) {
						tempNode.rightNode = new treeNode(value);
						break;
					}else {
//						value = tempNode.rightNode.value;=> do 
						tempNode=tempNode.rightNode;//tiep tuc buoc nhay 
					}
				}else {
					if(tempNode.leftNode!=null) {
						tempNode.leftNode = new treeNode(value);
						break;
					}else {
						tempNode = tempNode.leftNode;//tiep tuc buoc nhay 
					}	 
				}
			}
		}
		return root;
	}

}
