package arrays_hashing;

public class leetcode27_updating {
	//remove element
	//step1 : for each to find element
	//step2 : remove 
	public int removeElement(int[] nums, int val) {
		int n=nums.length;
		for(int i=0;i<n;) {
			if(nums[i]==val) {
				//xoa phan tu a[i] thi se gan phan tu dung sau cho phan tu hien tai 
				for(int j=i;j<=n-2;j++) {
					nums[j]=nums[j+1];
				}
				n--;
			}else { //Neu truong hop khong phai xoa 
				i++;
			}
		}
        return n;
    }
	

}
