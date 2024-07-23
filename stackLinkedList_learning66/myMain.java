package stackLinkedList_learning66;

public class myMain {
	public static void main(String[] args) {
		imstackLinkedList newStack = new imstackLinkedList();
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		newStack.push(5);
		System.out.println("------------------------");
		newStack.printing();
		System.out.println("-------------------------");
		newStack.pop();
		newStack.printing();
	}

}
