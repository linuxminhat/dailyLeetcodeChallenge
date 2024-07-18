package linkedlist_learning2;

public class linkedlist_learning3 {
	public static void printingNodeValue(Node head) {
		if(head==null) {
			System.out.println("This linkedlist is empty");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.value);
				temp = temp.next;
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
		
		printingNodeValue(n1);
	}

}
