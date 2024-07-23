package stackLinkedList_learning66;

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
		if(!isFull()) {
			Node addedNode = new Node(value);
			addedNode.next=topNode;
			topNode=addedNode;
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
		}else {
			Node tempNode = topNode;
			while(tempNode!=null) {
				System.out.println(tempNode.value);
				tempNode=tempNode.next;
			}
			System.out.println();	
		}
	 
		
	}

}
