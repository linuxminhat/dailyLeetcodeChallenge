package heap;

public class myHeap1 {
	private static int MAX_SIZE = 100;//Heap chua 100 phan tu 
	private int[] array = new int[MAX_SIZE+1];//Tao mang de chua tat ca cac gia tri nay
	private int size;
	
	myHeap1(){
		int size=0;
	}
	public boolean isEmpty() {
		return size==0;//TRUE
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Error : Heap is empty ! ");
			return -1;
			
		}
		return array[1];	
	}	
	public void swap(int i,int j) {
		int k = array[i];
		array[i] = array[j];
		array[j] = k;
	}
	public void addFunction(int v) {
		//add gia tri v vao heap
		size++;
		array[size]=v;
		int curIndex=size;
		int parIndex=curIndex/2;
		while(array[parIndex]>array[curIndex]) {
			swap(parIndex,curIndex);
			curIndex=parIndex;
			parIndex=curIndex/2;
		}
	}
}
