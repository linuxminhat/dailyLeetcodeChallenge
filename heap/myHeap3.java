package heap;

public class myHeap3 {
	private int max_size = 100;
	private int[] array = new int[max_size];
	private int size;
	myHeap3() {
		size = 0;
	}
	public boolean isEmpty() {
		return size==0;//TRUE=> empty
	}
	public int peekHeap() {
		if(isEmpty()==true) {
			System.out.println("This heap is fucking empty");
			return -1;
		}
		return 0;
	}
	public  void swap(int i,int j) {
		int t = array[i];
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
		array[1]=array[size];
		size--;
		//heapify 
		int curIndex=1;
		while(curIndex*2<=size) {
			if(isEmpty()==true) {
				System.out.println("This heap is empty !");
				return -1;
			}else {
				int leftChildIndex=curIndex*2;
				int smallerChildIndex=leftChildIndex;
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
		}
		
		return minRoot;
		
	
	}

}
