package arrays_hashing;
import java.util.ArrayList;
import java.util.Arrays;

public class leetcode27 {
	public static Integer[] nums={3,2,2,3};
	public static ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(nums));
	//Function to remove Element 
	public static int removeElement(Integer[] nums, int val) {
		int count=0;
		for(Integer element : nums) {
			if(element==val) {
				count++;
				System.out.println(removeElementInArray(element));
//				removeElementInArray(element);
			}
		}
		return count;
//		return removeElementInArray(element);
    }
	
	private static ArrayList<Integer> removeElementInArray(int element) {
//		ArrayList<Integer> newArray = new ArrayList<>(Arrays.asList(nums));
		for(int i=0;i<arrayList.size();i++) {
			if(arrayList.get(i)==element) {
				arrayList.remove(i);
			}
		}
		return arrayList;
	}
	public static void main(String[] args) {
		System.out.println(removeElement(nums,3));
	}
}