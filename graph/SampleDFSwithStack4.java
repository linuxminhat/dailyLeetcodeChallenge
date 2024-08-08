package graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SampleDFSwithStack4 {
	public static void main(String[] args) {
		int[][] graph = {
				{0,1,0,0,0,0,0},
				{1,0,1,1,1,0,0},
				{0,1,0,0,0,1,0},
				{0,1,0,0,0,1,1},
				{0,1,0,0,0,0,1},
				{0,0,1,1,0,0,0},
				{0,0,0,1,1,0,0}};
		
		Stack<Integer> myStack = new Stack<>();
		Set<Integer> daDuyet = new HashSet<>();
		myStack.add(0);
		daDuyet.add(0);
		while(!myStack.isEmpty()) {
			int u = myStack.pop();
			System.out.println(u);
			for(int v = 0; v<graph.length;v++) {
				if(graph[u][v] == 1 && daDuyet.contains(v) == false) {
					myStack.add(v);
					daDuyet.add(v);
				}
			}
		}
	}

}
