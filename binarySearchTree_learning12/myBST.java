package binarySearchTree_learning12;

public class myBST {
	public treeNode root;
	myBST(){
		
	}
	public treeNode insert(treeNode myRoot,int value) {
		if(myRoot==null) {
			return new treeNode(value);
		}else {
			if(value>myRoot.value) {
				if(myRoot.rightNode==null) {
					return new treeNode(value);
				}else {
					insert(myRoot.rightNode,value);
				}
			}else {
				if(myRoot.leftNode==null) {
					return new treeNode(value);
				}else {
					insert(myRoot.leftNode,value);
				}
			}
		}
		return myRoot;
	}
	public treeNode findingLeftModeNode(treeNode myRoot) {
		treeNode leftModeNode = myRoot;
		while(leftModeNode.leftNode==null) {
			leftModeNode = leftModeNode.leftNode;
		}
		return leftModeNode;
	}
	public treeNode delete(treeNode myRoot, int key) {
		if(myRoot==null) {
			return myRoot;
		}
		if(key>myRoot.value) {
			myRoot.rightNode=delete(myRoot.rightNode,key);
		}else {
			if(key<myRoot.value) {
			myRoot.leftNode=delete(myRoot.leftNode,key);
			}
		}
		//Case1 : leafNode 
		if(myRoot.leftNode==null && myRoot.rightNode==null) {
			return null;
		}
		//Case2 : 1 childNode 
		if(myRoot.leftNode==null && myRoot.rightNode!=null) {
			return myRoot.rightNode;
		}
		if(myRoot.rightNode==null && myRoot.leftNode!=null) {
			return myRoot.leftNode;
		}
		//Case3 : 2 childNode
		treeNode leftModeNode = findingLeftModeNode(myRoot.rightNode);
		myRoot.value=leftModeNode.value;
		return myRoot.rightNode=delete(myRoot.rightNode,leftModeNode.value);
		
	}
	 
}
