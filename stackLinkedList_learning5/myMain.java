package stackLinkedList_learning5;

public class myMain {
	public static void main(String[] args) {
		imistackLinkedList newStack = new imistackLinkedList();
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		newStack.printing();
		newStack.pop(); 
		
		newStack.printing();
	}

}
