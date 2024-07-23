package queueLinkedList;

public class imqueueLinkedList implements iqueueLinkedList{
	public class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	Node headNode,tailNode;
	imqueueLinkedList(){
		headNode =null;
		tailNode =null;
	}

	@Override
	public boolean push(int value) {
		if(isFull()) {
			return false;
		}
		Node newNode = new Node(value);
		if(isEmpty()) {
			 headNode=tailNode=newNode;
		}else {
			tailNode.next=newNode;
			tailNode=newNode;
		}
		return true;
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int value = headNode.value;
		//only 1 
		if(headNode==tailNode) {
			headNode=tailNode=null;
		}else {
			headNode=headNode.next;
		}
		return value;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean isFull() {
		return (headNode==null && tailNode ==null);
	}

	@Override
	public void printing() {
		if(isEmpty()) {
			System.out.println("This linked list is empty !");
		}else {
			Node curNode = headNode;
			while(curNode!=null) {
				System.out.print(curNode.value);
				curNode=curNode.next;
			}
			System.out.println("");
		
	}
	

}
}
