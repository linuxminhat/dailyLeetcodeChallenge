package stackLinkedList_learning;

import java.util.ArrayList;

public class imstackLinkedList implements istackLinkedList {
	public class Node{
		
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	Node topNode;
	imstackLinkedList(){
		//Khoi tao 
		topNode=null;
		
	}
	@Override
	public boolean push(int value) {
		if(!isFull()) {
			Node newNode = new Node(value);
			newNode.next=topNode;
			topNode=newNode;
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int value=topNode.value;
		topNode=topNode.next;
		return value;
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
		if(isEmpty()) {
			System.out.println("This stack is empty !");
		}
		Node temp = topNode;
		ArrayList<Integer>tempList = new ArrayList<>();
		while(temp!=null) {
			System.out.println(temp.value);
			tempList.add(temp.value);
			temp=temp.next;
		}
		for(int i=tempList.size()-1;i>=0;i--) {
			System.out.println(tempList.get(i)+ " ");
		}
		System.out.println();
		 
		
	}

}
