package com.nikhil.lohia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public static void main(String[] args) {
		 int[] num= {-1,0,1,2,-1,-4};
		   List<List<Integer>> res=threeSum(num);
		   System.out.println(res);   // [[-1, -1, 2], [-1, 0, 1]]
	}

	private static List<List<Integer>> threeSum(int[] num) {
		if(num == null || num.length<3)
			return new ArrayList<>();
		//Sort the numbers
		Arrays.sort(num);  //[ -4,-1,-1,0,1,2]
		 Set<List<Integer>> set = new HashSet<>();
		//fix the length upto 3 numbers
		 for(int i=0;i<num.length-2;i++) {
			 int left=i+1;
			 int right=num.length-1;
			 
			 while(left<right) {
				 int sum= num[i]+num[left]+num[right];
				 if(sum == 0) {
					 //Add to the set and move tofind other triplets
					 set.add(Arrays.asList(num[i],num[left],num[right]));
					 left++;
					 right--;
				 }else if(sum < 0)
					 left++;
				 else
					 right--;
			 }
		 }
		
		
		return new ArrayList<>(set);
	}

}
