package binarySearchTree_learning5;

public class myBST {
	public treeNode root;
	myBST(){
		
	}
	public treeNode inserting(treeNode myRoot,int value) {
		if(myRoot==null) {
			myRoot = new treeNode(value);
			return myRoot;
		}else {
			while(true) {
				treeNode tempNode = myRoot;
				//Case1 : greater 
				if(value>tempNode.value) {
					if(tempNode.rightNode==null) {
						tempNode.rightNode.value = value;
						break;
						//Finding a place and then break
					}else{
						tempNode = tempNode.rightNode;
					}
				}
				else {
					if(tempNode.leftNode==null) {
						tempNode.leftNode.value=value;
						break;
					}else {
						tempNode=tempNode.leftNode;
					}
				}
			}
		}
		return myRoot;
	}

}
