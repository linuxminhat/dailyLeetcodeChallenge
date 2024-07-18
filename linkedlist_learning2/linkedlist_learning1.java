package linkedlist_learning2;

public class linkedlist_learning1 {
	//creating class Node 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	//Always see a node is a head 
	public static void printingLinkedList(Node head) {
		if(head==null) {
			System.out.println("This list is empty");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.value);
				temp = temp.next;//Previous node to next node 
				if(temp!=null) {
					System.out.print("->");
				}else {
					System.out.println(" ");
				}
				
			}
		}
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next=n2;
		n2.next=n3;
		printingLinkedList(n1);
		printingLinkedList(n2);
	}

}
