package linkedlist_learning2;

public class addToHead_learning5 {
	//implementing class Node 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	//printing function
	public static void printingNodeValue(Node head) {
		if(head==null) {
			System.out.println("This linked list is empty !");
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
	public static Node addToHead(Node headNode,int value) {
		Node addedNode =new  Node(value);
		if(headNode==null) {
			return addedNode;
		}else {
			addedNode.next=headNode;
		}
		return addedNode;
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next=n2;
		printingNodeValue(n1);
		printingNodeValue(n2);
		Node newNode = addToHead(n1,0);
		printingNodeValue(newNode);
		
	}

}
