package linkedlist_learning2;

public class addToBetween_learning4 {
	//creating class Node 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	//implementing printing function 
	public static void printingFunction(Node head) {
		if(head==null) {
			System.out.println("This linked list is empty !");
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
		Node newNode = new Node(value);
		if(headNode==null) {
			return newNode;
		}else {
			newNode.next=headNode;
		}
		return newNode;
	}
	//implementing function addToLast 
	public static Node addToLast(Node headNode,int value) {
		Node newNode = new Node(value);
		if(headNode==null) {
			return newNode;
		}else {
			Node lastNode = headNode;
			//If using lastNode!=null it will go through the last node of lastNode
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
			lastNode.next=newNode;
		}
		return headNode;
	}
	//implementing function to addToBetween
	public static Node addToBetween(Node headNode,int value,int index) {
		if(index==0) {
			return addToHead( headNode, value);
		}else {
			Node curNode = headNode;
			Node newNode = new Node(value);
			int count=0;
			while(curNode.next!=null) {
				count++;
				if(count==index) {
					newNode.next=curNode.next;
					curNode.next=newNode;
					break;
				}
				curNode=curNode.next;
			}
		}
		return headNode;
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next=n2;
		n2.next=n3;
		printingFunction(n1);
		printingFunction(n2);
		printingFunction(n3);
		Node newAddedNode = addToHead(n1,0);//This is a method
		printingFunction(newAddedNode);
		Node newAddedNode2 = addToLast(n1,4);
		printingFunction(newAddedNode2);
		Node newAddedNode3 = addToBetween(n1,10,3);
		printingFunction(newAddedNode3);
	}
}
