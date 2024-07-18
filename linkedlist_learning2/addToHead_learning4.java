package linkedlist_learning2;

public class addToHead_learning4 {
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	public static void printingNodeValue(Node head) {
		if(head==null) {
			System.out.println("This linkedlist is empty");
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
	public static Node addToNode(Node addedNode,int value) {
		Node newNode = new Node(value);
		if(addedNode==null) {
			return newNode;
		}else {
			newNode.next=addedNode;
			return newNode;
		}
	}

}
