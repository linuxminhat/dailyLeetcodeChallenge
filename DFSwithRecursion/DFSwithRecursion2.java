package DFSwithRecursion;

import java.util.HashSet;
import java.util.Set;

public class DFSwithRecursion2 {
	public static void DFSwithRecursion(int u, int[][] graph, Set<Integer>daDuyet) {
		System.out.println(u + "");
		for(int v=0;v<graph.length;v++) {
			if(graph[u][v]==1 && daDuyet.contains(v)==false) {
				daDuyet.add(v);
				DFSwithRecursion(v,graph,daDuyet);
			}
		}
		
	}
	public static void main(String[] args) {
		int[][] graph = {
				{0,1,0,0,0,0,0},
				{1,0,1,1,1,0,0},
				{0,1,0,0,0,1,0},
				{0,1,0,0,0,1,1},
				{0,1,0,0,0,0,1},
				{0,0,1,1,0,0,0},
				{0,0,0,1,1,0,0}};
		Set<Integer> daDuyet = new HashSet<>();
		daDuyet.add(0);
		DFSwithRecursion(0,graph,daDuyet);
		
	}

}
