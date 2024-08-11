package heap;

public class myHeap5 {
	private int MAX_SIZE = 100;
	private int size;
	private int[] array = new int[MAX_SIZE];
	public boolean isEmpty() {
		return size==0;
	}
	public int peekHeap() {
		if(isEmpty()==true) {
			System.out.println("This heap is empty");
			return -1;
		}
		return 0;
	}
	 
	public void swap(int i, int j) {
		int k=array[i];
		array[i]=array[j];
		array[j]=k;
	}
	public void add(int v) {
		size++;
		array[size]=v;
		int curIndex=size;
		int parIndex=curIndex/2;
		while(array[parIndex]>array[curIndex]) {
			swap(parIndex,curIndex);
			curIndex=parIndex;//gan lai gia tri
			parIndex=curIndex/2;//Tiep tuc tinh tien 
		}
	}
}
