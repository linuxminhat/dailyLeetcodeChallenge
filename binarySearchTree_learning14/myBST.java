package binarySearchTree_learning14;

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
//					myRoot.rightNode.value = value;=> wrong 
					myRoot.rightNode = new treeNode(value);
				}else {
					insert(myRoot.rightNode,value);
				}
			}else {
				if(myRoot.leftNode==null) {
//					myRoot.leftNode.value=value;
					myRoot.leftNode = new treeNode(value);
				}else {
					insert(myRoot.leftNode,value);
				}
			}
		}
		return myRoot;
	}
	public treeNode findingLeftModeNode(treeNode myRoot) {
		
		treeNode leftModeNode = myRoot;
		while(leftModeNode.leftNode!=null) {
			leftModeNode = leftModeNode.leftNode;
		}
		return leftModeNode;
	}

	public treeNode delete(treeNode myRoot,int key) {
		if(myRoot==null) {
			return myRoot;
		}else {
			if(key>myRoot.value) {
				myRoot.rightNode = delete(myRoot.rightNode,key);
			}else {
				myRoot.leftNode = delete(myRoot.leftNode,key);
			}
		}
		//All case 
		//Case 1 : leafNode
		if(myRoot.rightNode==null && myRoot.leftNode==null) {
			return null;
		}
		//Case 2 : 1 childNode 
		if(myRoot.rightNode!=null && myRoot.leftNode==null) {
			return myRoot.rightNode;
		}
		if(myRoot.leftNode!=null && myRoot.rightNode==null) {
			return myRoot.leftNode;
		}
		//Case 3 : 2 childNode 
		if(myRoot.rightNode!=null && myRoot.leftNode!=null) {
			treeNode leftModeNode = findingLeftModeNode(myRoot.rightNode);
			myRoot.value = leftModeNode.value;
			myRoot.rightNode = delete(myRoot.rightNode,leftModeNode.value);
			 
		}
		return myRoot;
		
	}
	 

}
