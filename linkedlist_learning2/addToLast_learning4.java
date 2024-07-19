package linkedlist_learning2;

public class addToLast_learning4 {
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	public static void printingNodeValue(Node head) {
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
	public static Node addtoHead(Node headNode,int value) {
		Node newNode = new Node(value);
		if(headNode==null) {
			return newNode;
		}else {
			newNode.next=headNode;
		}
		return  newNode;
	}
	public static Node addToLast(Node headNode1,int value) {
		Node newNode1 = new Node(value);
		if(headNode1==null) {
			return newNode1;
		}else {
			Node lastNode = headNode1;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
			lastNode.next=newNode1;
			return headNode1;
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
		printingNodeValue(n3);
		Node newNode = addToLast(n1,5);
		printingNodeValue(newNode);
	}

}
