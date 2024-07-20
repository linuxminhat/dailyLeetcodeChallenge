package linkedlist_learning2;

public class removeToHead_learning2 {
	public static class Node{
		int value;
		Node next;
		Node (int value){
			this.value=value;
		}
	}
	public static void printingNodeValue(Node head) {
		if(head==null) {
			System.out.println("This linkedlist is empty !");
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
	public static Node removeToHead(Node headNode) {
		if(headNode!=null) {
			return headNode.next;
		}else {
			return headNode;
		}
	}
	public static Node removeToLast(Node headNode) {
		if(headNode==null) {
			return headNode;
		}
		Node lastNode = headNode;
		Node previousNode = null;
		while(lastNode.next!=null) {
			previousNode=lastNode;
			lastNode = lastNode.next;
		}
		if(previousNode==null) {
			//Thereis only 1 node 
			return previousNode;
		}else {
			previousNode.next=lastNode.next;
		}
			
		return headNode;
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		Node n10 = new Node(10);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n8;
		n8.next=n9;
		n9.next=n10;
		printingNodeValue(n1);
		Node removeNode = removeToLast(n1);
		printingNodeValue(removeNode);
	}
}
