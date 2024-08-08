package graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import binarySearchTree_learning3.main;

public class SampleDFSwithStack2 {
	public static void main(String[] args) {
		int[][] graph = {
				{0,1,0,0,0,0,0},
				{1,0,1,1,1,0,0},
				{0,1,0,0,0,1,0},
				{0,1,0,0,0,1,1},
				{0,1,0,0,0,0,1},
				{0,0,1,1,0,0,0},
				{0,0,0,1,1,0,0}};
		//Khai bao 
		Stack<Integer> stack = new Stack<>();
		stack.add(0);
		Set<Integer> daDuyet = new HashSet<>();
		daDuyet.add(0);
		//Khoi tao 
		while(!stack.isEmpty()) {
			 int u = stack.pop();
			 //process u 
			 System.out.println(u + "");
			 for(int v = 0;v<graph.length;v++) {
				 if(graph[u][v]==1 && daDuyet.contains(v)==false) {
					 stack.add(v);
					 daDuyet.add(v);
				 }
			 }
		}
		//Duyet theo stack 
	}
	
}
