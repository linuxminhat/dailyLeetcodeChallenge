package linkedlist_learning2;

public class linkedList_fullFunction {
	//implementing class Node 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;		}
	}
	//implementing printingFunction
	public static void printingFunction(Node head) {
		if(head==null) {
			System.out.println("This linkedlist is empty ! ");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.value);
				temp=temp.next;
				if(temp!=null) {
					System.out.print("->");
				}else {
					System.out.println();
				}
			}
		}
	}
	//implementing function addToHead
	public static Node addToHead(Node headNode,int value) {
		Node addedNode = new Node(value);
		if(headNode==null) {
			return addedNode;
		}else {
			addedNode.next=headNode;
		}
		return addedNode;
	}
	//implementing function addToLast
	public static Node addToLast(Node headNode,int value) {
		Node addedNode = new Node(value);
		if(headNode==null) {
			return addedNode;
		}else {
			Node lastNode = headNode;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
			lastNode.next=addedNode;
		}
		return headNode;
		
	}
	//implementing function addToBetween 
	public static Node addToBetween(Node headNode,int value,int index) {
		Node addedNode = new Node(value);
		if(headNode==null) {
			return addedNode;
		}
		if(index==0) {
			return addToHead(headNode,value);
		}
		if(index>0) {
			Node curNode = headNode;
			int count=0;
			while(curNode.next!=null) {
				count++;
				if(index==count) {
					addedNode.next=curNode.next;
					curNode.next=addedNode;
				}
				curNode=curNode.next;
			}
		}
		return headNode;
	}
	//implementing function deleteToHead
	public static Node deleteToHead(Node headNode){
		if(headNode==null) {
			return headNode;
		}else {
			return headNode.next;
		}
		
	}
	//implementing function deleteToLast
	public static Node deleteToLast(Node headNode) {
		if(headNode==null) {
			return headNode;
		}else {
			Node lastNode=headNode;
			Node previousNode=null;
			while(lastNode.next!=null) {
				previousNode = lastNode;
				lastNode=lastNode.next;
			}
			previousNode.next=lastNode.next;
		}
		return headNode;
	}
	//main function 
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		printingFunction(n1);
		//testing OK
//		//testing addToHead
//		Node newNode1 = addToHead(n1,0);
//		printingFunction(newNode1);
//		//testing addToLast
//		Node newNode2 = addToLast(n1,1000);
//		printingFunction(newNode2);
//		//testing addToBetween
//		Node newNode3 = addToBetween(n1,999,0);
//		printingFunction(newNode3);
//		//testing deleteToHead
//		Node newNode4 = deleteToHead(n1);
//		printingFunction(newNode4);
		Node deletedNode = deleteToLast(n1);
		printingFunction(deletedNode);
		
	
	}

}
