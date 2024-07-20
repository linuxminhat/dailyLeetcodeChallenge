package linkedlist_learning2;

public class removewToHead_learning1 {
	//creating class Node 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	//implementing printing
	public static void printing(Node head) {
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
	//implementing addToHead
	public static Node addToHead(Node headNode,int value) {
		Node addedNode = new Node(value);
		if(headNode==null) {
			return addedNode;
		}else {
			addedNode.next=headNode;
		}
		return addedNode;
	}
	//implementing addToLast 
	public static Node addToLast(Node headNode,int value) {
		Node addedNode = new Node(value);
		if(headNode==null) {
			return addedNode;
		}else {
			Node lastNode = headNode;
			while(lastNode.next!=null) {
				lastNode = lastNode.next;
			}
			lastNode.next=addedNode;
		}
		return headNode;
	}
	//implementing addToBetween 
	public static Node addToBetween(Node headNode,int value,int index) {
		if(index==0) {
			return addToHead(headNode,value);
		}else {
			Node curNode = headNode;
			Node addedNode = new Node(value);
			int count = 0;
			while(curNode.next!=null) {
				if(count==index) {
					addedNode.next=curNode.next;
					curNode.next=addedNode;		
				}
				curNode=curNode.next;
			}
		}
		return headNode;
	}
	//implementing removeToHead
	public static Node removeToHead(Node headNode) {
		if(headNode!=null) {
			return headNode.next;
		}else {
			return headNode;
		}
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next=n2;
		n2.next=n3;
		printing(n1);
		printing(n2);
		printing(n3);
		Node removedNode = removeToHead(n1);
		printing(removedNode);
	}
}
