package DFSwithStack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SampleDFSwithStack3 {
	public static void main(String[] args) {
		//Dinh nghia mot ma tran ke cua do thi 
		int[][] graph = {
				{0,1,0,0,0,0,0},
				{1,0,1,1,1,0,0},
				{0,1,0,0,0,1,0},
				{0,1,0,0,0,1,1},
				{0,1,0,0,0,0,1},
				{0,0,1,1,0,0,0},
				{0,0,0,1,1,0,0}};
		
		Stack<Integer> stack = new Stack<>();
		Set<Integer> daDuyet = new HashSet<>();
		//Dinh 0 
		//Bat dau tu dinh 0 
		stack.add(0);
		daDuyet.add(0); 
		//Khi stack khong rong thi tiep tuc duyet 
		// = Stack con dinh chua xu li 
		while(!stack.isEmpty()) {
			//Lay ra cai dinh hien tai 
			int u = stack.pop();
			//processing u 
			System.out.println(u + "");
			for(int v = 0;v<graph.length;v++) {
				if(graph[u][v] == 1 && daDuyet.contains(v)==false) {
					stack.add(v);
					daDuyet.add(v);
				}
			}
		}
	}
}
