package queueLinkedList_learning2;

public class imqueueLinkedList implements iqueueLinkedList {
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	Node headNode;
	Node tailNode;
	
	imqueueLinkedList(){
	headNode=null;
	tailNode=null;
	}
	@Override
	public boolean push(int value) {
		if(isFull()) {
			return false;
		}
		Node addedNode = new Node(value);
		if(isEmpty()) {
			headNode=tailNode=addedNode;
		}
		tailNode.next=addedNode;
		tailNode=addedNode;
		return true;
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int value = headNode.value;
		headNode=headNode.next;		 
		return value;
	}

	@Override
	public boolean isEmpty() {
		return headNode==null && tailNode==null;
	}

	@Override
	public boolean isFull() {
		 
		return false;
	}

	@Override
	public void printing() {
		if(isEmpty()) {
			System.out.println("This queue is empty !");
		}
		Node newNode = headNode;
		while(newNode!=null) {
			System.out.println(newNode.value);
			newNode=newNode.next;
		}
		System.out.println();		
	}

}
