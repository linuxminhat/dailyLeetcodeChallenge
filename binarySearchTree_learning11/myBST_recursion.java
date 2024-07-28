//package binarySearchTree_learning11;
//
//public class myBST_recursion {
//	public treeNode root;
//	myBST_recursion(){
//		
//	}
//	public treeNode insert(treeNode myRoot,int value) {
//		if(myRoot==null) {
//			return new treeNode(value);
//		}else {
//			if(value>myRoot.value) {
//				if(myRoot.rightNode==null) {
//					return new treeNode(value);
//				}else {
//					insert(myRoot.rightNode, value);
//				}
//			}else {
//				if(myRoot.leftNode==null) {
//					return new treeNode(value);
//				}else {
//					insert(myRoot.leftNode,value);
//				}
//			}
//		}
//		return myRoot;
//	}
//	//Tim node trai cung cua cay 
//	public treeNode findingLeftModeNode(treeNode myRoot) {
//		if(myRoot==null) {
//			return null;
//		}
//		treeNode leftMostNode = myRoot;
//		while(leftMostNode!=null) {
//			leftMostNode = leftMostNode.leftNode;
//		}
//		return leftMostNode;
//	}
//	
//	//delete node key 
//	//return new tree
//	public treeNode deleteNode(treeNode myRoot, int key) {
//		if(root==null) {
//			return null;
//		} 
//		//B1 : Di tim node xoa 
//		if(key<root.value) {
//			myRoot.leftNode = deleteNode(myRoot.leftNode,key);
//		}else {
//			myRoot.rightNode = deleteNode(myRoot.rightNode,key);
////		}else {
//			//B2 : xoa node root 
//			//TH1 : root la node la 
//			if(myRoot.leftNode==null && myRoot.rightNode==null) {
//				return null;
//			}
//			//TH2 : root la node chi co 1 con ben trai 
//			if(myRoot.leftNode!=null && myRoot.rightNode==null) {
//				return myRoot.leftNode;
//			}else {
//				return myRoot.rightNode;
//			}
//			//TH3 : root la node co 2 node con
//			treeNode leftModeNode = findingLeftModeNode(myRoot.rightNode);
//			myRoot.value=leftModeNode.value;
//			deleteNode(myRoot.rightNode,leftModeNode.value);
//			
//			 
//		}
//	}
//
//}
