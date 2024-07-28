package binarySearchTree_learning9;

public class myBST {
	public treeNode root;
	myBST(){
		
	}
	public treeNode insertion(treeNode myRoot, int value) {
		if(myRoot==null) {
			myRoot = new treeNode(value);
			return myRoot;
		}else {
			treeNode tempNode = myRoot;
			while(true) {
				if(value>tempNode.value) {
					if(tempNode.rightNode==null) {
						tempNode.rightNode.value=value;
						break;
					}else {
						tempNode = tempNode.rightNode;
					}
				}else {
					if(tempNode.leftNode==null) {
						tempNode.leftNode.value=value;
						break;
						
					}else {
						tempNode = tempNode.leftNode;
					}
				}
			}
		}
		return myRoot;
	}

}
