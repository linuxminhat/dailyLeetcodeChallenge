package linkedlist_learning2;

import linkedlist_learning2.addToLast_learning1.Node;

public class addToLast_learning2 {
	//implementing class Node 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	//implementing function to printing Node 
	public static void printingFunction(Node head) {
		if(head==null) {
			System.out.println("This linkedlist is empty");
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
	public static Node addToHead(Node headNode1,int value) {
		Node addedNode1 = new Node(value);
		if(headNode1==null) {
			return addedNode1;
		}else {
			addedNode1.next=addedNode1;
		}
		return addedNode1;
	}
	//implementing function addToLast 
	public static Node addToLast(Node headNode2,int value) {
		Node addedNode2 = new Node(value);
		if(headNode2==null) {
			return addedNode2;
		}else {
			//Theo nhu li thuyet chung ta can di tim phan tu lastNode 
			Node lastNode = headNode2;// da cap nhat (!)
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
			lastNode.next=addedNode2;
		}
		return headNode2;//(!)
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next=n2;
		n2.next=n3;
		Node newNode = addToLast(n1,5);
		printingFunction(newNode);
	}
}
