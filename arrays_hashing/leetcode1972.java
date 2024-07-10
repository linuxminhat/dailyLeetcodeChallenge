package arrays_hashing;

public class leetcode1972 {
	//accounts[i][j] : the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank.
	/*
	 * [1 2 3 ] => i=2
	 * [3 2 1 ] => j=3
	 */
	static int soDong,soCot;
	int[][] accounts = new int[soDong][soCot];
	public int maximumWealth(int[][] accounts) {
		//assumes : accounts[i][j]
		int personalAccounts = 0;
		int temp_maximumPersonalAccounts=0;
		for(int row=0;row<soDong;row++) {
//			personalAccounts+=accounts[row][0];
			for(int col=0;col<soCot;col++) {
				personalAccounts+=accounts[row][col];
				if(temp_maximumPersonalAccounts<personalAccounts) {
					temp_maximumPersonalAccounts=personalAccounts;
				}
			}
		}
		return temp_maximumPersonalAccounts;
    }
	public static void main(String[] args) {
		
	}
}
