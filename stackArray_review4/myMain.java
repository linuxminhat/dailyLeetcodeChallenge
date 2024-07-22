package stackArray_review4;

public class myMain {
	public static void main(String[] args) {
		imstackArray newArray = new imstackArray(3);
		newArray.push(1);
		newArray.push(2);
		newArray.push(3);
		newArray.printing();
		newArray.pop();
		newArray.printing();
	}

}
