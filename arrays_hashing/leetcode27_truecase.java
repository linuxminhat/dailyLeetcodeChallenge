package arrays_hashing;

public class leetcode27_truecase {
	public static int removeElement(int[] nums, int val) {
		//Bản chất của mảng là immutable nên chúng ta không thể xoá được, ta chỉ có thể dồn nó mà thôi 
		int number_elements = nums.length;
		for(int i=0;i<number_elements;) {
			if(nums[i]==val) {
				for(int k=i;k<=number_elements-2;) {
					nums[k]=nums[k+1];
					number_elements--;
				}
			}else {//Không cần phải xoá 
				i++;
			}
		}
		return number_elements;
    }
}
