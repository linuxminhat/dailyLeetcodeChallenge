package binarySearchTree_addandremove2;

public class myBinarySearchTree {
	public treeNode root;
	myBinarySearchTree(){
		
	}
	public treeNode insert(treeNode myRoot, int value) {
		if(myRoot==null) {
			return new treeNode(value);
		}else {
			treeNode tempNode = myRoot;
			if(value>tempNode.value) {
				if(tempNode.rightNode==null) {
					tempNode.rightNode.value=value;
				}else {
					tempNode = tempNode.rightNode;
				}
			}else {
				if(tempNode.leftNode==null) {
					tempNode.leftNode.value=value;
				}else {
					tempNode = tempNode.leftNode;
				}
			}
		}
		return myRoot;
	}
	public treeNode finindgLeftNode(treeNode myRoot) {
		if(myRoot==null) {
			return myRoot;
		}
		treeNode leftModeNode = myRoot;
		while(leftModeNode.leftNode!=null) {
			leftModeNode = leftModeNode.leftNode;
		}
		return leftModeNode;
	}
	public treeNode delete(treeNode myRoot,int key) {
		if(myRoot==null) {
			return myRoot;
		}
		if(key>myRoot.value) {
			myRoot.rightNode=delete(myRoot.rightNode,key);
		}else {
			myRoot.leftNode=delete(myRoot.leftNode,key);
		}
		//Case1 : leafNode
		if(myRoot.rightNode==null && myRoot.leftNode==null) {
			return null;
		}
		//Case2 : 1 child 
		if(myRoot.rightNode!=null && myRoot.leftNode==null) {
			return myRoot.rightNode;
		} 
		if(myRoot.leftNode!=null && myRoot.rightNode==null) {
			return myRoot.leftNode;
		}
		//Case3 : 2 child 
		if(myRoot.rightNode!=null && myRoot.leftNode!=null) {
			treeNode leftModeNode = finindgLeftNode(myRoot.rightNode);
			myRoot.value = leftModeNode.value;
			myRoot.rightNode = delete(myRoot.rightNode,leftModeNode.value);
			
		}
		return myRoot;
		  
		
		
	}

}
