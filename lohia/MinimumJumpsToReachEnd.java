package com.nikhil.lohia;

public class MinimumJumpsToReachEnd {
	public static void main(String[] args) {
		int[] num= {2,4,1,2,3,1,1,2};
   int res= jumps(num);
		System.out.println(res);
	}

	private static int jumps(int[] num) {
		
		int total_Jumps=0;
		int dest=num.length-1; // Last index
		
		int coverage=0,lastJumpIdx=0;
		
		for(int i=0;i<num.length;i++) {
			coverage=Math.max(coverage, i+num[i]);
			
			if(i==lastJumpIdx) {
				lastJumpIdx = coverage;
				total_Jumps++;
				//Check if we reach dest.
				if(coverage > dest) {
					return total_Jumps;
				}
			}
		}
	
		return total_Jumps;
	}

}
