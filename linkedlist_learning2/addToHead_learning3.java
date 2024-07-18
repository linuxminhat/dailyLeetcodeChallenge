package linkedlist_learning2;

public class addToHead_learning3 {
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	public static void printingNodeValue(Node head) {
		if(head==null) {
			System.out.println("This linked list is empty");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.value);
				temp=temp.next;
				if(temp!=null) {
					System.out.print("->");
				}else {
					System.out.println();
				}
			}
		}
	}
	public static Node addToHead(Node addedHead,int value) {
		Node newNode =new  Node(value);
		if(addedHead==null) {
			return newNode;
		}else {
			newNode.next=addedHead;
			return newNode;
		}
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node newNode = addToHead(n1,5);
		printingNodeValue(newNode);
	}

}
