package binarySearchTree_recur1;

public class myBST {
	public treeNode root;
	myBST(){
		
	}
	public treeNode inserting(treeNode myRoot, int value) {
		if(myRoot==null) {
			return new treeNode(value);
		}else {
			if(value>myRoot.value) {
				if(myRoot.rightNode==null) {
					myRoot.rightNode = new treeNode(value);
				}else {
					inserting(myRoot.rightNode,value);
				}
			}else {
				if(myRoot.leftNode==null) {
					myRoot.leftNode = new treeNode(value);
				}else {
					inserting(myRoot.rightNode,value);
				}
			}
		}
		return myRoot;
	}

}
