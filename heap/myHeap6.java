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
	public int pollHeap() {
		if(isEmpty()) {
			System.out.println("This heap is empty !");
			return -1;
		}
		int minRoot=array[1];
		array[1]=array[size];
		size--;
		int curIndex=1;
		while(curIndex*2<=1) {
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
			if(array[curIndex]>=array[smallerChildIndex]) {
				swap(curIndex,smallerChildIndex);
				curIndex=smallerChildIndex;
			}else {
				break;
			}
		}
		return minRoot;
	}
	

}
