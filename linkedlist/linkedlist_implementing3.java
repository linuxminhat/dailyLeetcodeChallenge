package linkedlist;



public class linkedlist_implementing3 {
	public static class Node{
		int value;
		//Biến này là biến dùng để tham chiếu tới giá trị kế tiếp
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	public static void printingLinkedList(Node head) {
		//Đây là phương thức tĩnh 
		//Dùng để in các phần tử của danh sách liên kết 
		//Bắt đầu từ "head"
		if(head==null) {
			System.out.println("This is an empty linkedlist");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.value);
				temp=temp.next;
				if(temp!=null) {
					System.out.println("->");
				}else {
					System.out.println();
				}
			}
		}
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		
	}

}
