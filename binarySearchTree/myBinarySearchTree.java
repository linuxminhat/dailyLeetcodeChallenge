//package binarySearchTree;
//
//public class myBinarySearchTree {
//	private treeNode mainRoot;
//	public myBinarySearchTree() {
//		
//	}
//	//implementing function to insert
//	public treeNode inserting(treeNode root, int value) {
//		//TH1 : root ==null 
//		if(root==null) {
//			root = new treeNode(value);
//			return root;
//		}else {
//			treeNode tempRoot = root;
//			while(true) {
//				if(value>tempRoot.value) {
//					tempRoot = tempRoot.rightNode;
//				}else {
//					tempRoot = tempRoot.rightNode;
//				}
//			}
//		}
//		
//		return null;
//		
//	}
//
//}
