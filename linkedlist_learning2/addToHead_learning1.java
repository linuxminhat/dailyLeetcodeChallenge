	package linkedlist_learning2;
	
	public class addToHead_learning1 {
		public static class Node{
			int value;
			Node next;
			Node(int value){
				this.value=value;
			}
		}
		public static void printingNodeValue(Node head) {
			if(head==null) {
				System.out.println("This linkedlist is empty");
			}else {
				 Node temp = head;
				 while(temp!=null) {
					 System.out.print(temp.value);
					 temp=temp.next;
	//				 temp.next=temp;
					 if(temp!=null) {
						 System.out.print("->");
					 }else {
						 System.out.println();
					 }
				 }
			}
		}
		public static Node addToHead(Node addedHead,int value) {
			Node newNode = new Node(value);
			if(addedHead==null) {
				return newNode;
			}else {
				newNode.next=addedHead;
			}
			return newNode;
		}
		public static void main(String[] args) {
			Node n1 = new Node(1);
			Node n2 = new Node(2);
			Node n3 = new Node(3);
			n1.next=n2;
			n2.next=n3;
			printingNodeValue(n1);
			printingNodeValue(n2);
			Node notOldNode =  addToHead(n1,0);
			printingNodeValue(notOldNode);
			
		}
	
	}
