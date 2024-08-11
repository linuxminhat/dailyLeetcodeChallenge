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
	public int poll() {
		if(isEmpty()==true) {
			System.out.println("This heap is empty");
			return -1;
		}
		int minRoot = array[1];
		//heapify-down
		array[1]=array[size];
		size--;
		int curIndex=1;
		while((2*curIndex)<=size) {
			int leftChildIndex=2*curIndex;
			int rightChildIndex = leftChildIndex+1;
			int smallerChildIndex = leftChildIndex;
			if(rightChildIndex<=size && array[rightChildIndex]<array[leftChildIndex] ) {
				smallerChildIndex = rightChildIndex;
			}else {
				smallerChildIndex = leftChildIndex;
			}
			if(array[curIndex]>array[smallerChildIndex]) {
				swap(curIndex,smallerChildIndex);
				curIndex=smallerChildIndex;
				
			}else {
				//If its ok => break
				break;
				
			}
		}
		
		
		return minRoot;
	}
	public static void main(String[] args) {
		myHeap1 myHeap = new myHeap1();
		myHeap.addFunction(10);
		myHeap.addFunction(5);
		myHeap.addFunction(1);
		System.out.println(myHeap.poll());
	}
}
