package binarySearchTree_learning2;

public class testing {
	public static void main(String[] args) {
		myBinarySearchTree myBST = new myBinarySearchTree();
		myBST.mRoot = myBST.insert(myBST.mRoot, 5);
		myBST.mRoot = myBST.insert(myBST.mRoot, 1);
		myBST.mRoot = myBST.insert(myBST.mRoot, 6);
		myBST.mRoot = myBST.insert(myBST.mRoot, 0);
		myBST.mRoot = myBST.insert(myBST.mRoot, 3);
		myBST.mRoot = myBST.insert(myBST.mRoot, 7);
	}

}
