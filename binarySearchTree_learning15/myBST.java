//package binarySearchTree_learning15;
//
//public class myBST {
//	public treeNode root;
//	myBST(){
//		
//	}
//	public treeNode insert(treeNode myRoot, int value) {
//		if(myRoot==null) {
//			return null;
//		}else {
//			if(value>myRoot.value) {
//				if(myRoot.rightNode==null) {
//					myRoot = new treeNode(value);
//				}else {
//					insert(myRoot.rightNode,value);
//				}
//			}else {
//				if(myRoot.leftNode==null) {
//					myRoot = new treeNode(value);
//				}else {
//					insert(myRoot.leftNode,value);
//				}
//			}
//		}
//		return myRoot;
//	}
//	public treeNode findingLeftModeNode(treeNode myRoot) {
//		treeNode leftModeNode = myRoot;
//		while(leftModeNode.leftNode!=null) {
//			leftModeNode = leftModeNode.leftNode;
//		}
//		return leftModeNode;
//	}
//	public treeNode delete(treeNode myRoot,int key) {
//		if(myRoot==null) {
//			return null;
//		}else {
//			//Common case 
//			if(key>myRoot.value) {
//				delete(myRoot.rightNode,key);
//			}else {
//				if(key<myRoot.value) {
//					delete(myRoot.leftNode,key);
//				}
//			}
//			//Separate case 
//			//Case1 : LeafNode 
//			if(myRoot.rightNode==null && myRoot.leftNode==null) {
//				return null;
//			}
//			//Case2 : 1 ChildNode 
//			if(myRoot.rightNode!=null && myRoot.leftNode!=null) {
//				return myRoot.rightNode;
//			}else {
//				return myRoot.leftNode;
//			}
//			//Case3 : 2 ChildNode 
//			if(myRoot.rightNode!=null && myRoot.leftNode!=null) {
//				
//			}
//		}
//	 
//	}
//
//}
