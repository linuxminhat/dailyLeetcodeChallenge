package linkedlist_learning2;

public class removeToHeadandLast {
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	public static void printingNodeValue(Node head) {
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
	public static Node removeToHead(Node headNode) {
		if(headNode!=null) {
			return headNode.next;
		}else {
			return headNode;
		}
	}
	public static Node removeToLast(Node headNode) {
		if(headNode==null) {
			return headNode;
		}else {
			Node lastNode = headNode;
			Node previousNode=null;
			while(lastNode.next!=null) {
				previousNode=lastNode;
				lastNode=lastNode.next;
			}
			if(previousNode==null) {
				return previousNode;
			}else {
				previousNode.next=lastNode.next;
			}
		}
		return headNode;
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next=n2;
		n2.next=n3;
		Node newNode = removeToLast(n1);
		printingNodeValue(newNode);
		
	}

}
