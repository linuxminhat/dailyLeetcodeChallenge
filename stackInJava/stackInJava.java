package stackInJava;

import java.util.*;
public class stackInJava {
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
//		myStack.pop();
//		for(Integer value : myStack) {
//			System.out.println(value);
//		}
		System.out.println("Pop"+myStack.pop());//Pop3 
		//Con lai 2 
		myStack.push(4);
		for(Integer value : myStack) {
			System.out.println(value);
		}
	}

}
