package com.nikhil.lohia;

import java.util.Arrays;

public class FindFirstAndLastPosition {
	public static void main(String[] args) {
		int [] arr= {3,4,5,8,7,9,8};
	      int target=8;
	     int[] flResult= findFirstAndLastPosition(arr,target);
	     System.out.println("First & Last position - " + Arrays.toString(flResult));
	}

	private static int[] findFirstAndLastPosition(int[] arr, int target) {
		int[] newArray=new int[2];
		  newArray[0]=-1;
		  newArray[1]=-1;
		  
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i]==target) {
				  if(newArray[0]==-1) {
					  newArray[0]=i+1;
				  }else {
					  newArray[1]=i+1;
				  }
			  }
		  }
		return newArray;  // First & Last position - [4, 7]

	}

}
