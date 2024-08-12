package com.nikhil.lohia;

public class ClimbingStairWays {

	public static void main(String[] args) {
		int steps=5;
		System.out.println("Number of ways " + climbing(steps));
	}

	private static int climbing(int steps) {
		// TODO Auto-generated method stub
		if(steps <=1)
			return 1;
		int[]dp=new int[steps+1];
		dp[1]=1;
		dp[2]=2;
		
		for(int i=3;i<=steps;i++) {
			dp[i]=dp[i-1]+dp[i-2];   // 1=1; 2= 2; 3rd -> 2+1 = 3 ways ; 4th -> 3+2 = 5 ways; 5th -> 5+3 =8 ways
		}
		return dp[steps];
	}
}
