package linkedlist_learning2;

public class addToLast_learning3 {
	//implementing clas Node 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	//implementing function to printing 
	public static void printingNodeValue(Node head) {
		if(head==null) {
			System.out.println("This linkedlist is empty ! ");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp);
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
	public static Node addToHead(Node headNode1,int value) {
		Node addedNode1 = new Node(value);
		if(headNode1==null) {
			return addedNode1;
		}else {
			addedNode1.next=headNode1;
		}
		return addedNode1;
	}
	//implementing function to add to last 
	public static Node addToLast(Node headNode2,int value) {
		Node addedNode2 = new Node(value);
		if(headNode2==null) {
			return addedNode2;
		}else {
			Node lastNode = headNode2;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
		}
		return headNode2;
	}
	
}
