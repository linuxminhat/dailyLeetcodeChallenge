package linkedlist_learning2;

public class linkedlist_learning4 {
	//creating class Node 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	//printing Node function
	public static void printingNodeFunction(Node head) {
		if(head==null) {
			System.out.println("This linkedlist is empty");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.value);
				temp=temp.next;//auto update value
			} if(temp!=null) {
				System.out.print("->");
			}else {
				System.out.println();
			}
		}
	}

}
