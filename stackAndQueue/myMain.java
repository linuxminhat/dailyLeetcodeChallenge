package stackAndQueue;

public class myMain {
	public static void main(String[] args) {
		implementingStackwithArray myStack = new implementingStackwithArray(3);
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.show();
		
		myStack.pop();
		myStack.show();
		myStack.pop();
		myStack.show();
		myStack.pop();
		myStack.show();
		 
	}

}
