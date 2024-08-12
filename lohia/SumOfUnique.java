package com.nikhil.lohia;

public class SumOfUnique {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,4,1,4,4,7};
		int res=sumOfUniq(num);
		System.out.println(res);
	}

	private static int sumOfUniq(int[] num) {
		int[] fr=new int[15];
		int sum=0;
		for(int n : num)
			fr[n]++;
		for(int i=0;i<fr.length;i++) {
			if(fr[i]==1)
				sum+=i;
		}
		return sum;
	}

}
