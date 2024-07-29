package binarySearchTree_addandremove1;

public class myBST {
	public treeNode root;
	myBST(){
		
	}
	public treeNode insert(treeNode myRoot, int value) {
		if(myRoot==null) {
			return new treeNode(value);
		}else {
			if(value>myRoot.value) {
				if(myRoot.rightNode==null) {
					myRoot.rightNode=new treeNode(value);
				}else {
					insert(myRoot.rightNode,value);
				}
			}else {
				if(myRoot.leftNode==null) {
					myRoot.leftNode= new treeNode(value);
				}else {
					insert(myRoot.leftNode,value);
				}
			}
		}
		return myRoot;
	}
	public treeNode leftModeNodeFunction(treeNode root) {
		if(root==null) {
			return root;
		}
			treeNode leftModeNode=root;
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
				 myRoot.rightNode=delete(myRoot,key);
			 }else {
				 if(key<myRoot.value) {
					 myRoot.leftNode=delete(myRoot,key);
				 }
			 }
			 //Case1 : leafNode 
			 if(myRoot.rightNode==null && myRoot.leftNode==null) {
				 return null;
			 }
			 //Case2 : have 1 child
			 if(myRoot.rightNode==null && myRoot.leftNode!=null) {
				 return myRoot.leftNode;
			 }
			 if(myRoot.leftNode==null && myRoot.rightNode!=null) {
				 return myRoot.rightNode;
			 }
			 //Case3 : have 2 child 
			 if(myRoot.leftNode!=null && myRoot.rightNode!=null) {
				 treeNode leftModeNode = leftModeNodeFunction(myRoot.rightNode);
				 myRoot.value = leftModeNode.value;
				 myRoot.rightNode=delete(myRoot.rightNode,leftModeNode.value);
				  ;
			 }
		 }
		 return myRoot;
	}
}
