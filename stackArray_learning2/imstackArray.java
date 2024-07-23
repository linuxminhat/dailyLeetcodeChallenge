package stackArray_learning2;

import java.util.ArrayList;

public class imstackArray implements istackArray {
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	Node topNode;
	imstackArray(){
		topNode=null;
	}
	
	@Override
	public boolean push(int value) {
		//Them mot phan tu vao dau cua linkedlist
		
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
		 
		return topNode==null;
	}

	@Override
	public void printing() {
		if(isEmpty()) {
			System.out.println("Stack is empty ! ");
			return;
		}
		Node temp = topNode;
		ArrayList<Integer> tempList = new ArrayList<>();
		while(temp!=null) {
			System.out.println(temp.value+" ");
			tempList.add(temp.value);
			temp=temp.next;
		}
		for(int i=tempList.size();i>=0;i--) {
			System.out.println(tempList.get(i));
		}
		System.out.println();
		
		 
		
	}
	

}
