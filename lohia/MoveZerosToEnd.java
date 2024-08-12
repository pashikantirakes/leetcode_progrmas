package com.nikhil.lohia;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int arr[]= {1,0,2,0,4,6,0,4,0,0,45,65};
		 moveZeros(arr);
	}

	private static void moveZeros(int[] arr) {
	
		int counter=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[counter]=arr[i];
				counter++;			
			}
		}
		while(counter<arr.length) {
			arr[counter]=0;
			counter++;
		}
		System.out.println(Arrays.toString(arr));  //  [1, 2, 4, 6, 4, 45, 65, 0, 0, 0, 0, 0]
	}

}
