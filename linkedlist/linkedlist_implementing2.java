package linkedlist;

public class linkedlist_implementing2 {
	public static class Node{
		//Node contain data
		int val;
		//The next parameter variable 
		Node next;
		Node(int val){
			this.val=val;
		}
	}
	public static void printingLinkedList(Node head) {
		if(head == null) {
			System.out.println("List is empty");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.val);
				temp=temp.next;
				if(temp!=null) {
					System.out.print("->");
				}else {
					System.out.println();
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
	}
	

}
