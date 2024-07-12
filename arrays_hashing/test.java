package arrays_hashing;

public class test {
	public static void main(String[] args) {
		int[] arrays =  {1,2,3,4,5,6};
		for(int i=0;i<arrays.length;i++) {
			for(int j=0;j<i;j++) {
				System.out.println(arrays[i]);
				System.out.println(arrays[j]);
			}
		}
		
		
	}
}
