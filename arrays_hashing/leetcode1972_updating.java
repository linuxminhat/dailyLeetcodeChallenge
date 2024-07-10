//package arrays_hashing;
//
//public class leetcode1972_updating {
//	 int hang,cot;
//	 int[][] accounts = new int[hang][cot];
//	public static int maximumWealth(int[][] accounts) {
//		this.accounts=accounts;
//		int personalAccounts=0;
//		int maxPersonalAccount=0;
//		int r=0;
//		while(r<hang) {
//			for(int c=0;c<cot;c++) {
//				personalAccounts+=accounts[c][r];
//				if(personalAccounts>maxPersonalAccount) {
//					maxPersonalAccount=personalAccounts;
//				}
//			}
//			r++;
//		}
//		return maxPersonalAccount;
//    }
//	public static void main(String[] args) {
//		int hang = 2;
//		int cot = 3;
//		int[][] accounts = {
//			{1,2,3},
//			{3,2,1}
//		};
//		maximumWealth(accounts);
//	}
//}
