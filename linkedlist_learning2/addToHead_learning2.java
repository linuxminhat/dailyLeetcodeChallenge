package linkedlist_learning2;

public class addToHead_learning2 {
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	public static void printingNode(Node head) {
		if(head==null) {
			System.out.println("This linkedlist is empty");
		}else {
			Node tempValue = head;
			while(tempValue!=null) {
				System.out.print(tempValue.value);
//				tempValue.next=tempValue;
				tempValue=tempValue.next;
				if(tempValue!=null) {
					System.out.print("->");
				}else {
					System.out.println();
				}
			}
		}
	}
	public static Node addToHead(Node addedNode,int value) {
		Node newNode = new Node(value);
		if(addedNode==null) {
			return newNode;
		}else {
			newNode.next=addedNode;
		}
		return newNode;
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node newNode = addToHead(n1,5);
		printingNode(newNode);
	}
}
