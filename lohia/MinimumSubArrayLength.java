package com.nikhil.lohia;

public class MinimumSubArrayLength {
	public static void main(String[] args) {
		int[] num={2,3,1,2,4,3};
		int target=7;  // o/p = 2[4,3]
		
		int result=minSubArray(num,target);
		System.out.println(result);
	}

	private static int minSubArray(int[] num, int target) {
		int minLenWindow=Integer.MAX_VALUE;
		int currentSum=0;
		 //Start 2 Pointers
		 int left=0;
		 int right=0;
		 
		 while(right<num.length) {
			 //find the current sum & increase the window size
			  currentSum+=num[right]; //2+0=2,2+3=5,5+1=6,6+2==8
			  right++;
			  
			  //reduce the window size
			   while(currentSum >= target) { // 8>7
				  int currentWindowSize=right-left;
				  //update min length window
				  minLenWindow = Math.min(minLenWindow, currentWindowSize);
				  
				  currentSum-=num[left];
				  left++;
				   
			   }
		 }
		return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
	}

}
