package stackArray_learning2;

public class myMain {
	public static void main(String[] args) {
		imstackArray newStack = new imstackArray();
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		newStack.printing();
		System.out.println(newStack.pop());
		newStack.printing();
	}

}
