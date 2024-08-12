package com.nikhil.lohia;

public class JudgeSuareSum {
	public static void main(String[] args) {
		int num=73;
	boolean result=	 squareNum(num);
	System.out.println(result);
	}
/*
 * 0*0 + 8*8=64
 * 1*1 + 8*8=65
 * 2*2 + 8*8=69
 * 3*3 + 8*8=73
 * 
 * 
 */
	private static boolean squareNum(int num) {
		// TODO Auto-generated method stub
		if(num<0)
			return false;
		long left=0;
		long right=(int)Math.sqrt(num);
		 while(left<right) {
			 long sum = left*left + right*right;
			 if(sum==num)
				 return true;
			 else if(sum<num)
				 left++;
			 else
				 right--;
		 }
		return false;
	}

}
