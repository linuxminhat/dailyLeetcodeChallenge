package binarySearchTree_learning13;

public class myBST {
	private treeNode root;
	public myBST() {
		
	}
	public treeNode insert(treeNode myRoot,int value) {
		if(myRoot==null) {
			return myRoot;
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
		if(myRoot==null) {
			return null;
		} 
			treeNode leftModeNode = myRoot;
			while(leftModeNode.leftNode==null) {
				leftModeNode = leftModeNode.leftNode;
			}
		return leftModeNode;
	}
	public treeNode deleteNode(treeNode myRoot, int key) {
		if(myRoot==null) {
			return myRoot;
		}else {
			if(key>myRoot.value) {
				myRoot.rightNode=deleteNode(myRoot.rightNode,key);
			}else {
				myRoot.leftNode=deleteNode(myRoot.leftNode,key);
			}
		}
		//Case1 : leaftNode 
		if(myRoot.rightNode==null && myRoot.leftNode==null) {
			return null;
		}
		//Case2 : 1 childNode 
		if(myRoot.rightNode==null && myRoot.leftNode!=null) {
			return myRoot.leftNode;
		}else {
			if(myRoot.leftNode==null && myRoot.rightNode!=null) {
				return myRoot.rightNode;
			}
		}
		//Case3 : 2 childNode 
		if(myRoot.rightNode!=null && myRoot.leftNode!=null) {
			treeNode leftModeNode = findingLeftModeNode(myRoot.rightNode);
			myRoot.value=leftModeNode.value;
		    myRoot.rightNode=deleteNode(myRoot.rightNode,leftModeNode.value);
		}
		return myRoot;
	}

}
