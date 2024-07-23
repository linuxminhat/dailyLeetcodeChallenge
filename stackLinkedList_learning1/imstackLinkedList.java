package stackLinkedList_learning1;

import java.util.ArrayList;

public class imstackLinkedList implements istackLinkedList {
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	Node topNode;
	imstackLinkedList(){
		topNode=null;
	}
	@Override
	public boolean push(int value) {
		Node newNode = new Node(value);
		if(!isFull()) {
			newNode.next=topNode;
			topNode=newNode;
			return true;
		}
		 
		return false;
	}

	@Override
	public int pop() {
		 
		return 0;
	}

	@Override
	public boolean isFull() {
	 
		return false;
	}

	@Override
	public boolean isEmpty() {
		return topNode==null;
	}

	@Override
	public void showing() {
		if(isEmpty()) {
			System.out.println("This stack is empty !");
		}else {
			ArrayList<Integer>tempList = new ArrayList<Integer>();
			
			
		}
		 
		
	}

}
