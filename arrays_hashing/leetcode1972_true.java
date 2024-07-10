package arrays_hashing;

public class leetcode1972_true {
	//Trong mảng 1 chiều thì accounts.length = số dòng / accounts[0].length = số cột 
	public int maximumWealth(int[][] accounts) {
        int maxWealthAccount = 0;
        for (int r = 0; r < accounts.length; r++) {
            int personalAccount = 0;//cứ mỗi lần qua 1 chỉ số thì cộng dồn 
            for (int c = 0; c < accounts[r].length; c++) {
                personalAccount += accounts[r][c];
            }
            if (personalAccount > maxWealthAccount) {
                maxWealthAccount = personalAccount;
            }
        }

        return maxWealthAccount;
    }

}
