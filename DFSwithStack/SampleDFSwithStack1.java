package DFSwithStack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import binarySearchTree_learning3.main;

public class SampleDFSwithStack1 {
	public static void main(String[] args) {
		//declare 
		int[][] array = {
				{0,1,0,0,0},
				{1,0,1,0,1},
				{0,1,0,0,1},
				{0,0,0,0,1},
				{0,1,1,1,0}
		};
		
	//Declare stack 
		Stack<Integer> stack = new Stack<>();
		//Tat ca ca dinh da duoc duyet se duoc add vao daDuyet
		Set<Integer> daDuyet = new HashSet<>();
		stack.add(0);
		daDuyet.add(0);
		while(stack.isEmpty()!=false) {
			int u = stack.pop();
			//process u 
			System.out.println(u + "");
			for(int v = 0; v<array.length;v++ ) {
				if(array[u][v] == 1 && daDuyet.contains(v) == false) {
					stack.add(v);
					daDuyet.add(v);
				}
			}
		
		}
	}
	
}
