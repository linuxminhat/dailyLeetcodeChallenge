package timeAndSpaceComplexity;

public class leetcode509_betterperformance {
	 public int fib(int n) {
			int[] fibo =new int[31];
	        int i;
			fibo[0]=0;
			fibo[1]=1;
			for(i=2;i<=n;i++) {
				fibo[i]=fibo[i-1]+fibo[i-2];
			}
			return fibo[i];
		}

}
