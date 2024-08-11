package heap;

public class myHeap2 {
	private static int MAX_SIZE = 100;
	private int[] array= new int[MAX_SIZE+1];
	private int size;
	myHeap2() {
		size=0;
	}
	public boolean isEmpty() {
		return size==0;//If its true, it mean heap empty
	}
	public int peekHeap() {
		if(isEmpty()==true) {
			System.out.println("Error : This heap is fucking empty");
			return -1;
		}
		return array[1];
		
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
	public int poll() {
		if(isEmpty()==true) {
			System.out.println("This heap is empty !");
			return -1;
		}
		int minRoot=array[1];
		//heapify down
		array[1]=array[size];
		size--;
		int curIndex=1;
		while(curIndex*2<=size) {
			int leftChildIndex=curIndex*2;
			int rightChildIndex=leftChildIndex+1;
			int smallerChildIndex=leftChildIndex;//assume
			if(rightChildIndex*2<=size) {
				if(leftChildIndex<=rightChildIndex) {
					smallerChildIndex=leftChildIndex;
				}else {
					smallerChildIndex=rightChildIndex;
				}
				if(array[curIndex]<=array[smallerChildIndex]) {
					swap(curIndex,smallerChildIndex);
					curIndex=smallerChildIndex;
				}
			}else {
				break;
			}
		}
		return minRoot;
	}
	
	
	

}
