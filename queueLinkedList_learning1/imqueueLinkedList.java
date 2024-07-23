package queueLinkedList_learning1;

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
		headNode=tailNode=null;
	}
	

	@Override
	public boolean push(int value) {
		Node addedNode = new Node(value);
		if(isFull()) {
			return false;
		}
		if(isEmpty()) {
			headNode=tailNode=addedNode;
		}
//		tailNode=addedNode;
//		tailNode=tailNode.next;
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
		if(headNode==tailNode) {
			 headNode=tailNode=null;
		}else {
			headNode=headNode.next;	
		}
		
		 
		return 0;
	}

	@Override
	public boolean isFull() {
		 return false;
	}

	@Override
	public boolean isEmpty() {
		return (headNode==null && tailNode==null);
	}

	@Override
	public void printing() {
		if(isEmpty()) {
			System.out.println("This queue is empty !");
		}
		
		Node curNode = headNode;
		while(curNode!=null) { 
			System.out.println(curNode.value);
			curNode=curNode.next;
		}
		System.out.println();
		
	}

}
