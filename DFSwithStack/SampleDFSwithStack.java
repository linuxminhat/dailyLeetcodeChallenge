//package graph;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.Stack;
//
//import binarySearchTree_learning3.main;
//
//public class SampleDFSwithStack {
//	public static void main(String[] args) {
//		//Khai bao do thi ta se di xu li 
//		int[][]	graph = {
//				{0,1,0,0,0,0,0},
//				{1,0,1,0,1,0,0},
//				{0,1,0,0,0,1,0},
//				{0,1,0,0,0,1,1},
//				{0,1,0,0,0,0,1},
//				{0,0,1,1,0,0,0},
//				{0,0,0,1,1,0,0}};
//	}
//	//Khai bao 
//	Stack<Integer> stack = new Stack<>();
//	Set<Integer> daDuyet = new HashSet<>();
//	//Khoi tao
//	stack.add(0);
//	daDuyet.add(0);
//	while(!stack.isEmpty()) {
//		int u = stack.pop();
//		//Xu li dinh u 
//		System.out.println(u + "");
//		for(int v=0;v<graph.length;v++) {
//			
//		}
//	}
//	
//	//Duyet theo Stack 
//
//}
package DFSwithStack;


