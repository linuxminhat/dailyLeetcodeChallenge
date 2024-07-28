package binarySearchTree_learning11;

public class myBST_notRecursion {
	public treeNode root;
	myBST_notRecursion(){
		
	}
	public treeNode insert(treeNode myRoot, int value) {
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
	public treeNode findLeftModeNode(treeNode root) {
		if(root==null) {
			return null;
		}
		treeNode leftModeNode = root;//Gia su ban dau khong co not trai cung
		while(root.leftNode!=null) {
			leftModeNode = leftModeNode.leftNode;	
			 
		}
		return leftModeNode;
	}
	//xoa node key trong cay root 
	//return cay moi da duoc xoa node key 
	public treeNode deleteNode(treeNode root,int key) {
		if(root==null) {
			return null;
		}
		//B1 : common case 
		if(key>root.value) {
			root.rightNode=deleteNode(root.rightNode,key);
		}
		if(key<root.value) {
			root.leftNode=deleteNode(root.leftNode,key);
		}
		//TH1 : root la node la 
		if(root.leftNode==null && root.rightNode==null) {
			return null;
		}
		//TH2 : root chi co 1 con ben trai 
		if(root.leftNode!=null && root.rightNode==null) {
			return root.leftNode;
		}
		if(root.rightNode!=null && root.leftNode==null) {
			return root.rightNode;
		}
		//TH3 : root co 2 con 
		//Tim node trai cung cua cay con ben phai 
		treeNode leftModeNode = findLeftModeNode(root.rightNode);
		root.value = leftModeNode.value;
		root.rightNode=deleteNode(root.rightNode,leftModeNode.value);
		
		return root;
		
		
		 
	}

}
