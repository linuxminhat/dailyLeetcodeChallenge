package linkedlist_learning2;

public class addToBetween_learning3 {
	//creating class Node 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	//implementing function to view 
	public static void printingNodeValue(Node headNode) {
		if(headNode==null) {
			System.out.println("This linkedlist is empty !");
		}else {
			Node temp = headNode;
			while(temp!=null) {
				System.out.print(temp.value);
				temp=temp.next;//assign temp.next value to temp 
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
		Node newNode = new Node(value);
		if(headNode==null) {
			return newNode;
		}else {
			newNode.next=headNode;
		}
		return newNode;
	}
	public static Node addToLast(Node headNode,int value) {
		Node newNode = new Node(value);
		if(headNode==null) {
			return newNode;
		}else {
			Node lastNode=headNode;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
			lastNode.next=newNode;
		}
		return headNode;
	}
	public static Node addToBetween(Node headNode,int value,int index) {
		if(index==0) {
			return addToHead(headNode,value);
		}else {
			Node curNode = headNode;
			Node addedNode = new Node(value);
			int count=0;
			while(curNode!=null) {
				count++;
				if(count==index) {
					addedNode.next=curNode.next;
//					curNode.next=addedNode.next;//Thao tac nay sai vi addedNode.next dang la null
					curNode.next=addedNode;
					break;
				}
				curNode=curNode.next;
			}
		}
		return headNode;
	}
	public static void main(String[] args) {
		//Just testing addToBetween function
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next=n2;
		n2.next=n3;
//		Node addedNode1 = addToBetween(n1,1,0);
//		printingNodeValue(addedNode1);
		Node addedNode2 = addToBetween(n1,4,1);
		printingNodeValue(addedNode2);
	}
}
