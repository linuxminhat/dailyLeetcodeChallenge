package queueLinkedList_learning;

public class iqueueLinkedList implements queueLinkedList {
	public class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	Node headNode;
	Node tailNode;
	iqueueLinkedList(){
		headNode=null;
		tailNode=null;
	}

	@Override
	public boolean push(int value) {
		if(!isFull()) {
			//1 -> 2 1 -> 3 2 1 -> 4 3 2 1 -> 5 4 3 2 1
			Node addedNode = new Node(value);
			tailNode=addedNode;
			while(tailNode.next!=null) {
				
				tailNode=tailNode.next;
			}
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		 
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return (headNode==null & tailNode==null);
	}

	@Override
	public boolean isFull() {
		 
		return false;
	}

	@Override
	public void printing() {
		if(isEmpty()) {
			System.out.println("This Linked List is empty !");
		}else {
			Node tempNode = headNode;
			while(tempNode.next!=null) {
				System.out.println(tempNode.value);
				tempNode=tempNode.next;
			}
			System.out.println();
		}
		
	}

}
