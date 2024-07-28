package binarySearchTree_recur1;

public class myBST_notRecur {
	public treeNode root;
	myBST_notRecur(){
		
	}
	public treeNode inserting(treeNode myRoot,int value) {
		if(myRoot==null) {
			myRoot = new treeNode(value);
			return myRoot;
		}else {
			treeNode tempNode = myRoot;
			while(true) {
				if(value>tempNode.value) {
					if(tempNode.rightNode==null) {
						tempNode.rightNode.value = value;
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
