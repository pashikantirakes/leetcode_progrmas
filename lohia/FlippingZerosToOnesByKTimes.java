package com.nikhil.lohia;

public class FlippingZerosToOnesByKTimes {
	public static void main(String[] args) {
		int[] num= {1,1,1,0,0,0,1,1,1,0};
		int k=2;
	int res=	flipZeros(num,k);
	System.out.println(res);
	}

	private static int flipZeros(int[] num, int k) {
		int zeroCount=0;
		int start=0;
		int max_ones=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==0)
				zeroCount++;
			while(zeroCount>k) {
				// start pointer move upto zero and delete one zero make window size 2.
				if(num[start]==0)
					zeroCount--;
				start++;
			}
			max_ones=Math.max(max_ones, i-start+1);
		}

		return max_ones;
	}

}
