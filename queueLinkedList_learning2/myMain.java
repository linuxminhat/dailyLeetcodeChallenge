package queueLinkedList_learning2;

public class myMain {
	public static void main(String[] args) {
		imqueueLinkedList newLinkedList = new imqueueLinkedList();
		newLinkedList.push(1);
		newLinkedList.push(2);
		newLinkedList.push(3);
		newLinkedList.push(4);
		newLinkedList.push(5);
		newLinkedList.printing();
		System.out.println("-------------------------");
		newLinkedList.pop();
		newLinkedList.printing();
	}

}
