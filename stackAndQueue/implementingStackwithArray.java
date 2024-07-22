package stackAndQueue;

public class implementingStackwithArray implements isStackandQueue {
	private int[] array;
	private int SIZE; 
	private int topIndex;
	
	implementingStackwithArray(int size){
		SIZE = size;
		array = new int[size];
		topIndex=-1;//initializes an empty state
	}
	@Override
	public boolean push(int value) {
		if(!isFull()) {
			topIndex++;
			array[topIndex]=value;
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		 if(!isEmpty()) {
			 int value = array[topIndex];
			 topIndex--;
			 return value;
		 }
		 return -1;
	}

	@Override
	public boolean isFull() {
		return topIndex==SIZE-1;//tro vao phan tu cuoi cung 
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return topIndex<0;
	}
	@Override
	public void show() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			for(int i=0;i<topIndex;i++) {
				System.out.println(array[i]);
			}
			System.out.println();
		}
		
	}
	

}
