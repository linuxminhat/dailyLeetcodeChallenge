package stackLinkedList_learning6;

public class myMain {
	public static void main(String[] args) {
		imstackLinkedList newStack = new imstackLinkedList();
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		newStack.push(5);
		newStack.showing();
		System.out.println("--------------------");
		newStack.pop();
		newStack.showing();
		System.out.println("--------------------");
		newStack.pop();
		newStack.showing();
		System.out.println("--------------------");
		newStack.pop();
		newStack.showing();
		System.out.println("--------------------");
		newStack.pop();
		newStack.showing();
		System.out.println("--------------------");
		newStack.pop();
		newStack.showing();
	}

}
