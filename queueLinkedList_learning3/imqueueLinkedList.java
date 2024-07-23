package queueLinkedList_learning3;

public class imqueueLinkedList implements iqueueLinkedList {
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	Node topNode;
	Node tailNode;
	imqueueLinkedList(){
		topNode=null;
		tailNode=null;
	}
	

	@Override
	public boolean push(int value) {
		if(isFull()) {
			return false;
		}
		Node newNode = new Node(value);
		if(isEmpty()) {
			topNode=tailNode=newNode;
		}
		tailNode.next=newNode;
		tailNode=newNode;
		return true;
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int value = topNode.value;
		topNode=topNode.next;
		return value;
	}

	@Override
	public boolean isFull() {
		 
		return false;
	}

	@Override
	public boolean isEmpty() {
		return topNode==null && tailNode==null;
	}

	@Override
	public void printing() {
		Node newNode = topNode;
		while(newNode!=null) {
			System.out.println(newNode.value);
			newNode=newNode.next;
		}
	}

}
