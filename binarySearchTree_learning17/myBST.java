package binarySearchTree_learning17;

public class myBST {
	treeNode root;
	myBST(){
		
	}
	public treeNode insert(treeNode myRoot, int value) {
		if(myRoot==null) {
			return null;
		}else {
			if(value>myRoot.value) {
				if(myRoot.rightNode==null) {
					myRoot = new treeNode(value);
				}else {
					insert( myRoot.rightNode,  value);
				}
				 
			}else {
				if(value<myRoot.value) {
					if(myRoot.leftNode==null) {
						myRoot = new treeNode(value);
					}else {
						insert(myRoot.leftNode,value);
					}
				}
			}
		}
		return myRoot;
	}

}
