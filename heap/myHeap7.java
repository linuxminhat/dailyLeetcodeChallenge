package heap;

public class myHeap7 {
	private int MAX_SIZE=100;
	private int[] array = new int[MAX_SIZE];
	private int size;
	myHeap7() {
		size=0;
	}
	public boolean isEmpty() {
		System.out.println("This Heap is empty !");
		return size==0;
		//If size==0 => TRUE : This heap is empty
	}
	public int peek() {
		if(isEmpty()==true) {
			System.out.println("This Heap is empty");
			return -1;
		}
		return array[1];
	}
	public void swap(int i,int j) {
		int k=array[i];
		array[i]=array[j];
		array[j]=k;
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
	public int poll() {
		if(isEmpty()==true) {
			System.out.println("This heap is fucking empty !");
			return -1;
		}
		//take value
		int minRoot=array[1];
		//heapify
		array[1]=array[size];
		size--; 
		int smallerChildIndex=0;
		int curIndex=1;
		while(curIndex*2<=size) {
			int leftChildIndex=curIndex*2;
			int rightChildIndex=leftChildIndex+1;
			if(rightChildIndex<=size) {
				if(array[leftChildIndex]<=array[rightChildIndex]) {
					smallerChildIndex=leftChildIndex;
				}else {
					smallerChildIndex=rightChildIndex;
				}
			}
			if(array[curIndex]>array[smallerChildIndex]) {
				swap(curIndex,smallerChildIndex);
				curIndex=smallerChildIndex;
			}else {
				break;
			}
		}
		return minRoot;
	}
}
