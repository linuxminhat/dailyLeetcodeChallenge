package queueArray_review1;

public class myMain {
	public static void main(String[] args) {
		imqueueArray newArray = new imqueueArray(5);
		newArray.push(1);
		newArray.push(2);
		newArray.push(3);
		newArray.printing();
		newArray.pop();
		newArray.printing();
		
	}

}
