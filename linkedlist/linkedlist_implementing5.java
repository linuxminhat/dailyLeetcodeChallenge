package linkedlist;

public class linkedlist_implementing5 {
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	public static void printingNode(Node head) {
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
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		n1.next=n2;
		printingNode(n1);
		printingNode(n2);
	}

}
