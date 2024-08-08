package graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SampleDFSwithStack6 {
	public static void main(String[] args) {
		int[][] myStack = {
				{0,0,1,1,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0},
				{1,0,0,0,1,1,0,0,0,0,0},
				{1,0,0,0,0,0,1,0,0,0,0},
				{0,0,1,0,0,0,0,0,0,0,0},
				{0,0,1,0,0,0,0,0,0,0,0},
				{0,0,0,1,0,0,0,1,1,1,0},
				{0,0,0,0,0,0,1,0,0,0,1},
				{0,0,0,0,0,0,1,0,0,1,0},
				{0,0,0,0,0,0,1,0,1,0,1},
				{0,0,0,0,0,0,0,1,0,1,0}};
		Stack<Integer> stack = new Stack<>();
		Set<Integer> daDuyet = new HashSet<>();
		stack.add(0);
		daDuyet.add(0);
		while(!stack.isEmpty()) {
			int u = stack.pop();
			System.out.println(u + "");
			for(int v = 0 ; v<myStack.length;v++) {
				if(myStack[u][v] == 1 && daDuyet.contains(v) == false) {
					stack.add(v);
					daDuyet.add(v);
				}
			}
		}
		
		
		
	}

}
