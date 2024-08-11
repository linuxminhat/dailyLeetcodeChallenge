package heap;

public class myHeap6 {
	private int MAX_SIZE = 100;
	private int[] array = new int[MAX_SIZE];
	private int size;
	myHeap6() {
		size=0;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public int peekHeap() {
		if(isEmpty()==true) {
			System.out.println("This heap is empty");
			return -1;
		}
		return array[1];
	}
	public void swap(int i,int j) {
		int k=array[i];
		array[i]=array[j];
		array[j]=k;
	}
	public void add(int v) {
		//Tang size len 1 don vi 
		size++;
		array[size] = v;
		int curIndex=size;
		int parIndex=curIndex/2;
		//Doi cho den khi nao het thi thoi ! 
		while(parIndex!=0 && array[parIndex]>array[curIndex]) {
			swap(parIndex,curIndex);
			//Tiep tuc nhay len tren
			
			parIndex=curIndex/2;
			
		}
	}
	

}
