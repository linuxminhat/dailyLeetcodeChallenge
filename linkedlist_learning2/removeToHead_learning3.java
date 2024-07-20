package linkedlist_learning2;

import linkedlist_learning2.linkedlist_learning1.Node;

public class removeToHead_learning3 {
	public static class Node{
		int value;
		Node next;
		Node(int value){
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
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next=n2;
		n2.next=n3;
		printingNodeValue(n1);
		printingNodeValue(n2);
		
		Node removedNode = removeToHead(n1);
		printingNodeValue(removedNode);
	}
}
