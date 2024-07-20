package linkedlist_learning2;

public class addToBetween_learning5 {
	//creating class Node 
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	//creating printing Node value Function 
	public static void printingNodeValueFunction(Node head) {
		if(head == null) {
			System.out.println("This linkedlist is empty ! ");
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
	//creating addToHead function 
	public static Node addToHead(Node headNode,int value) {
		Node addedNode = new Node(value);
		if(headNode == null) {
			return addedNode;
		}else {
			addedNode.next=headNode;
			//return addedNode instead of headNode because headNode is not parametered 
//			headNode=addedNode;
		}
		return addedNode;
	}
	//creating addToLast function
	public static Node addToLast(Node headNode,int value) {
		Node addedNode = new Node(value);
		if(headNode==null) {
			return addedNode;
		}else {
			Node lastNode = headNode;//Trong khoa hoc chi can truy cap phan tu dau la keo duoc het cac phan tu sau 
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
			lastNode.next=addedNode;
		}
		return headNode;
	}
	//creating addToBetween function 
	public static Node addToBetween(Node headNode,int value,int index) {
		if(index==0) {
			return addToHead(headNode,value);
		}else {
			Node curNode = headNode;
			Node addedNode = new Node(value);
			int count = 0;
			while(curNode.next!=null) {
				count++;
				if(count==index) {
					addedNode.next=curNode.next;
					curNode.next=addedNode;
					break;
				}
				curNode=curNode.next;
			}
		}
		return headNode;
	}
	public static void main(String[] args) {
		//testing addToHead
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next=n2;
		n2.next=n3;
		printingNodeValueFunction(n1);
		printingNodeValueFunction(n2);
		printingNodeValueFunction(n3);
//		Node addedNode = addToHead(n1,0);
//		printingNodeValueFunction(addedNode);
		Node addedNode2 = addToLast(n1,10);
		printingNodeValueFunction(addedNode2);
		Node addedNode3 = addToBetween(n1,100,1);
		printingNodeValueFunction(addedNode3);
	}

}
