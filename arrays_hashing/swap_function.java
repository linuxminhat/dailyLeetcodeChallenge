package arrays_hashing;

public class swap_function {
	    static void swap (Integer x, Integer y) {
	        Integer temp = x;
	        x = y;
	        y = temp;
	    }

	    public static void main(String[] args) {
	       Integer a = 1;
	       Integer b = 2;
	       swap(a, b);
	       System.out.println("a=" + a + " b=" + b);
	    } 

}
