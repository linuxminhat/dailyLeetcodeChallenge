package linkedlist_learning2;

public class addToBetween_learning1 {
	//implementing class Node 
	public static class Node {
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	//implementing function to viewing 
	public static void printingNodeValue(Node head) {
		if(head==null) {
			System.out.println("This LinkedList is empty ! ");
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
	//implementing function add to first 
	public static Node addToFirst(Node headNode1,int value) {
		Node addedNode = new Node(value);
		if(headNode1==null) {
			return addedNode;
		}else {
			addedNode.next=headNode1;
		}
		return addedNode;
	}
	//implementing function add to last 
	public static Node addToLast(Node headNode2,int value) {
		Node addedToLastNode = new Node(value);
		if(headNode2==null) {
			return addedToLastNode;
		}else {
			Node lastNode = headNode2;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
			lastNode.next=addedToLastNode;
		}
		return headNode2;
	}
	//implementing function add to between 
	public static Node addToBetween(Node headNode3,int value,int index) {
		if(index==0) {
			return addToFirst(headNode3,value);
		}else {
			//Finding index 
			Node newNode = new Node(value);
			Node curNode = headNode3;
			int count=0;
			while(curNode!=null) {
				count++;
				if(count==index) {
					//Thuc hien 
					newNode.next=curNode.next;
					curNode.next=newNode;
					break;
				}
				curNode=curNode.next;
			}
			
		}
		 
		return headNode3;
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		n1.next=n2;
		n2.next=n3;
		printingNodeValue(n1);
		printingNodeValue(n2);
		printingNodeValue(n3);
		Node addedHeadNode = addToFirst(n1,12);
		printingNodeValue(addedHeadNode);
		Node addedLastNode = addToLast(n3,4);
		printingNodeValue(addedLastNode);
		Node newNode1 = addToBetween(n1,0,1);
		printingNodeValue(newNode1);
	}

}
