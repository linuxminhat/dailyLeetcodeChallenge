package linkedlist_learning2;

public class linkedlist_learning2 {
	//creating node class 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	public static void printingNode(Node head) {
		if(head == null) {
			System.out.println("This linkedlist is empty");
		}else {
			Node temp_value = head;
			while(temp_value!=null) {
				System.out.println(temp_value.value);
				temp_value=temp_value.next;
				if(temp_value!=null) {
					System.out.print("->");
				}else {
					System.out.println("");
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
		printingNode(n1);
		printingNode(n3);
		
	}

}
