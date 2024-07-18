package linkedlist_learning2;

public class linkedlist_learning5 {
	//creating class Node 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	//creating function to printing
	public static void printingNodeValue(Node head) {
		if(head==null) {
			System.out.println("This linkedlist is empty");
		}else {
			Node temp = head;
//			System.out.print(temp.value);
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
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		n1.next=n2;
		printingNodeValue(n1);
		printingNodeValue(n2);
		System.out.println(n1);
		System.out.println(n2);
	}
}
