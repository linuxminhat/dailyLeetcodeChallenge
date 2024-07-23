package stackLinkedList_learning3;

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
		if(isEmpty()) {
			return -1;
			
		}
		int value = topNode.value;
		topNode=topNode.next;
		return value;
	}

	@Override
	public boolean isEmpty() {
		
		return topNode==null;
	}

	@Override
	public boolean isFull() {
		
		return false;
	}

	@Override
	public void printing() {
		if(isEmpty()) {
			System.out.println("This stack is empty !");
			return;
		}
		Node temp = topNode;
		ArrayList<Integer> newArray = new ArrayList<>();
		while(temp!=null) {
//			System.out.print(temp.value+" ")s
			newArray.add(temp.value);
			temp=temp.next;
		}
		for(int i = newArray.size()-1;i>=0;i--) {
			System.out.print(newArray.get(i)+" ");
		}
		System.out.println();
		
	}

}
