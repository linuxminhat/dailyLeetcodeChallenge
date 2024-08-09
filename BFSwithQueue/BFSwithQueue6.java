package BFSwithQueue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFSwithQueue6 {
	public static void main(String[] args) {
		int[][] graph = {
				{0,1,0,0,0,0,0},
				{1,0,1,1,1,0,0},
				{0,1,0,0,0,1,0},
				{0,1,0,0,0,1,1},
				{0,1,0,0,0,0,1},
				{0,0,1,1,0,0,0},
				{0,0,0,1,1,0,0}};
		Queue<Integer> myQueue = new LinkedList<>();
		Set<Integer> daDuyet = new HashSet<Integer>();
		myQueue.add(0);
		daDuyet.add(0);
		//Add dinh dau 
		while(!myQueue.isEmpty()) {
			int u = myQueue.remove();
			System.out.println(u + "");
			for(int v=0;v<graph.length;v++) {
				if(graph[u][v]==1 && daDuyet.contains(v)==false) {
					myQueue.add(v);
					daDuyet.add(v);
				}
			}
		}
	}

}
