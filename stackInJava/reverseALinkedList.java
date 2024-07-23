package stackInJava;

import java.util.LinkedList;
import java.util.List;

class ListNode{
	int value;
	ListNode next;
	ListNode(int value){
		this.value=value;
	}
}
public class reverseALinkedList {
	public LinkedList<Integer> reverseList(ListNode head) {
		LinkedList<Integer> newHead = new LinkedList<>();
		while(head.next!=null) {
			int value = head.value;
			newHead.push(value);
			head=head.next;
		}
		return newHead;
    }

}
