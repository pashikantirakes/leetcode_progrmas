package com.nikhil.lohia;

public class Container_With_Max_Water {

	public static void main(String[] args) {
	int[] height= {1,8,6,2,5,4,8,3,7};
          int res=  maxArea(height);
          System.out.println(res);
	}

	private static int maxArea(int[] height) {
		int left=0;
		int right=height.length-1;
		int maxArea=0;
		
		 while(left < right) {
			 int area=Math.min(height[left], height[right])
					  * (right-left);
			 maxArea = Math.max(maxArea, area);
			 if(height[left] < height[right])
				 left++;
			 else
				 right--;
			 
		 }
		return maxArea;
	}

}
