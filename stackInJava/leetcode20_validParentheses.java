package stackInJava;

import java.util.Stack;

public class leetcode20_validParentheses {
	public boolean isValid(String s) {
		Stack<Character> myStack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='(' || c=='{' || c=='[') {
				if(myStack.isEmpty()==true) {
					return false;
				}
				char openPeek = myStack.peek();
				if(c=='(' && openPeek==')'
						|| c=='{' && openPeek=='}' 
						|| c=='[' && openPeek==']') {
					myStack.pop();
				}else {
					return false;
				}
			}
		}
		return myStack.isEmpty();
        
    }

}
