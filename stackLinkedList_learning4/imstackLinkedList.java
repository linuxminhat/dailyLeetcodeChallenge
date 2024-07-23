package stackLinkedList_learning4;

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
		Node addedNode = new Node(value);
		if(!isFull()) {
			addedNode.next=topNode;
			topNode=addedNode;
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		if(!isEmpty()) {
			int value = topNode.value;
			topNode=topNode.next;
			return value;
		}
		return -1;
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
	public void printing() {
		Node tempNode = topNode;
		
		if(isEmpty()) {
			System.out.println("This stack is empty !");
		}else {
			ArrayList<Integer> newArray = new ArrayList<>();
			while(tempNode!=null) {
				System.out.println(topNode.value);
				topNode=topNode.next;
				
			}
			for(int i=newArray.size()-1;i>=0;i--) {
				
			}
		}
		
	}

}
