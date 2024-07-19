package linkedlist_learning2;

public class addToLast_learning1 {
	//implementing Class Node 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	//implementing printing Function
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
	//implementing function to add to head 
	public static Node addToHead(Node headNode,int value) {
		Node addedNode = new Node(value);
		if(headNode==null) {
			return addedNode;
		}else {
			addedNode=addedNode.next;
		}
		return addedNode;
	}
	//implementing function to add to last 
	public static Node addToLast(Node headNode2,int value) {
		Node addedLastNode = new  Node(value);
		if(headNode2==null) {
			return addedLastNode;
		}else {
			Node lastNode = headNode2;
			while(lastNode.next!=null) {
				lastNode = lastNode.next;
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
		Node addedLastNode = addToLast(n1,4);
		printingNodeValue(addedLastNode);
	}
}
