package queueArray_review2;

public class myMain {
	public static void main(String[] args) {
		imqueueArray newArray = new imqueueArray(5);
		newArray.push(1);
		newArray.push(2);
		newArray.push(3);
		newArray.push(4);
		newArray.push(5);
		newArray.push(6);//not found 
		newArray.printing();
		newArray.pop();
		newArray.printing();
	}

}
