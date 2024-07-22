package stackArray_review2;

public class myMain {
	public static void main(String[] args) {
		imstackArray newArray = new imstackArray(4);
		newArray.push(1);
		newArray.push(2);
		newArray.push(3);
		newArray.push(4);
		//printing
		newArray.printing();
		newArray.pop();
		newArray.printing();
	}

}
