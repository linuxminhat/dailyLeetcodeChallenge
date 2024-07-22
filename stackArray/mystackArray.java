package stackArray;

public class mystackArray implements stackArray {
	private int[] array;
	private int SIZE;
	private int topIndex;
	mystackArray(int size){
		 SIZE = size;
		 array = new int[SIZE];
		 topIndex=-1;//assume the empty array 
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
		return topIndex==SIZE-1;
	}

	@Override
	public boolean isEmpty() {
		return topIndex<0;
	}
	public void printing() {
		if(isEmpty()) {
			System.out.println("This stack is empty !");
		}else {
			for(int i=0;i<=topIndex;i++) {
				System.out.println(array[i]+"");
			}
			System.out.println();
		}
		
	}

}
