package linkedlist_learning2;

public class addToLast_learning5 {
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
	public static Node addToHead(Node headNode1, int value) {
		Node addedHeadNode = new Node(value);
		if(headNode1==null) {
			return addedHeadNode;
		}else {
			addedHeadNode.next=headNode1;
		}
		return addedHeadNode;
	}
	public static Node addToLast(Node headNode2,int value) {
		Node addedLastNode = new Node(value);
		if(headNode2==null) {
			return addedLastNode;
		}else {
			Node lastNode = headNode2;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
			lastNode.next=addedLastNode;
		}
		return headNode2;
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
		Node newNode = addToLast(n1,4);
		printingNodeValue(newNode);
	}
}
