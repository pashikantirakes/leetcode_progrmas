package com.nikhil.lohia;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,9,2,5,3,6,101,18};
		int res=longestIncreaseSubseq(num);
		System.out.println(res);
	}

	private static int longestIncreaseSubseq(int[] num) {
		int arr[]=new int[num.length];
		for(int i=1;i<num.length;i++) {
			for(int j=0;j<i;j++) {
				if(num[i]>num[j])
					if(arr[j]+1 > arr[i])
						arr[i]=arr[j]+1;
			}
		}
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		return arr[max]+1;
	}

}
