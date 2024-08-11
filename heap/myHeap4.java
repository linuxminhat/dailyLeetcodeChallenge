package heap;

public class myHeap4 {
	private int MAX_SIZE = 100;
	private int size;
	private int[] array = new int[MAX_SIZE];
	myHeap4() {
		size=0;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public int peekHeap() {
		if(isEmpty()==true) {
			System.out.println("This heap is fucking empty ! ");
			return -1;
		}
		return array[1];//Luu y : Tra ve phan tu co index la 1 
	}
	public void swap(int i,int j) {
		int t=array[i];
		array[i]=array[j];
		array[j]=t;
	}
	public void addFunction(int v) {
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
	public int pollHeap() {
		int minRoot=array[1];
		//heapify processing
		array[1]=array[size];
		size--;
		int curIndex=1;
		while(curIndex*2<=size) {
			int leftChildIndex=curIndex*2;
			int rightChildIndex=leftChildIndex+1;
			int smallerChildIndex=leftChildIndex;
			if(rightChildIndex<=size) {
				if(array[leftChildIndex]<=array[rightChildIndex]) {
					smallerChildIndex=leftChildIndex;
				}else {
					smallerChildIndex=rightChildIndex;
				}
			}
			if(array[curIndex]<array[smallerChildIndex]) {
				swap(curIndex,smallerChildIndex);
				curIndex=smallerChildIndex;
			}else {
				break;
			}
		}
		return minRoot;
	}
	

}
