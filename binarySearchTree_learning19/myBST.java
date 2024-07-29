package binarySearchTree_learning19;

public class myBST {
	public treeNode root;
	myBST(){
		
	}
	public treeNode insert(treeNode myRoot, int value) {
		if(myRoot==null) {
			return null;
		}else {
			if(value>myRoot.value) {
				if(myRoot.rightNode==null) {
					myRoot.rightNode = new treeNode(value);
				}else {
					insert(myRoot.rightNode,value);
				}
			}else {
				if(myRoot.leftNode==null) {
					myRoot.leftNode = new treeNode(value);
				}else {
					insert(myRoot.leftNode,value);
				}
			}
		}
		return myRoot;
	}
	public treeNode findingLeftModeNode(treeNode myRoot) {
		if(myRoot==null) {
			return null;
		}
		treeNode leftModeNode = myRoot;
		while(leftModeNode!=null) {
			leftModeNode = leftModeNode.leftNode;
		}
		return leftModeNode;
	}
	public treeNode delete(treeNode myRoot, int key) {
		if(myRoot==null) {
			return null;
		}else {
			if(key>myRoot.value) {
				myRoot = delete(myRoot.rightNode,key);
			}else {
				if(key<myRoot.value) {
					myRoot = delete(myRoot.leftNode,key);
				}
			}
		}
		//Separate Case 
		//Case1 : 
		if(myRoot.leftNode==null && myRoot.rightNode==null) {
			return null;
		}
		//Case2 : 
		if(myRoot.leftNode!= null && myRoot.rightNode==null) {
			return myRoot.leftNode;
		}
		if(myRoot.rightNode!=null && myRoot.leftNode==null) {
			return myRoot.rightNode;
		}
		//Case3 : 
		if(myRoot.leftNode==null && myRoot.rightNode==null) {
			treeNode leftModeNode = findingLeftModeNode(myRoot.rightNode);
			myRoot.value = leftModeNode.value;
			myRoot.rightNode = delete(myRoot.rightNode,leftModeNode.value);
		}
		return myRoot;
	}

}
