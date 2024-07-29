package binarySearchTree_learning20;
public class myBST {
	private treeNode root;
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
					insert(myRoot.rightNode,value);
				}
				 
			}else {
				if(myRoot.leftNode==null) {
					myRoot = new treeNode(value);
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
		while(leftModeNode.leftNode!=null) {
			leftModeNode = leftModeNode.leftNode;
		}
		return leftModeNode;
	}
	public treeNode delete(treeNode myRoot,int key) {
		if(myRoot==null) {
			return null;
		}else {
			//implementing common case 
			if(key>myRoot.value) {
				myRoot = delete(myRoot.rightNode,key);
			}else {
				if(key<myRoot.value) {
					myRoot = delete(myRoot.leftNode,key);
				}
			}
		}
		//Separate case 
		//Case1 : 1 leafNode 
		if(myRoot.leftNode==null && myRoot.rightNode==null) {
			return null;
		}
		//Case2 : 1 childNode 
		if(myRoot.leftNode==null && myRoot.rightNode!=null) {
			return myRoot.rightNode;
		}else {
			if(myRoot.rightNode==null && myRoot.leftNode!=null) {
				return myRoot.leftNode;
			}
		}
		//Case3 : 2 childNode 
		if(myRoot.leftNode!=null && myRoot.rightNode!=null) {
			treeNode leftModeNode = findingLeftModeNode(myRoot.rightNode);
			myRoot.value = leftModeNode.value;
			myRoot.rightNode = delete(myRoot.rightNode,leftModeNode.value);
		}
		return myRoot;
	}
	public treeNode searching(treeNode myRoot,int value) {
		if(myRoot==null) {
			return null;
		}else {
			if(value>myRoot.value) {
				searching(myRoot.rightNode,value);
			}else {
				if(value<myRoot.value) {
					searching(myRoot.leftNode,value);
				}else {
					if(value==myRoot.value) {
						myRoot.value=value;
					}
				}
			}
		}
		return myRoot;
	}
	public static void preOrder(treeNode currentNode) {
		if(currentNode==null) {
			return;
		}
		System.out.print(currentNode.value);
		preOrder(currentNode.leftNode);
		preOrder(currentNode.rightNode);
	}
	//Tuong tu inOrder va PostOrder
	
	public static void main(String[] args) {
		treeNode node1 = new treeNode(0);
		treeNode node2 = new treeNode(1);
		treeNode node3 = new treeNode(3);
		treeNode node4 = new treeNode(4);
		treeNode node5 = new treeNode(6);
		treeNode node6 = new treeNode(7);
		treeNode node7 = new treeNode(2);
		treeNode node8 = new treeNode(5);
		node1.leftNode=node2;node1.rightNode=node7;
		node2.leftNode=node3;node2.rightNode=node4;
		node4.leftNode=node5;node4.rightNode=node6;
		node7.leftNode=null;node7.rightNode=node8;
		node8.leftNode=null;
		node8.rightNode=null;
		preOrder(node1);
		
	}
}
