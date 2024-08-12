package com.nikhil.lohia;

public class SortColorsDutchNation {
public static void main(String[] args) {
	int[] num= {2,0,2,1,1,0};
	sortColors(num);
	for(int n : num) {
		System.out.println(n+" ");
	}
	
}

private static void sortColors(int[] num) {
	int start=0;
	int mid=0;
	int end=num.length-1;
	while(mid<=end) {
		switch (num[mid]) {
		case 0:
			//Swap the start index
			swap(num,start,mid);
			mid++;
			start++;
			break;
		case 1:
		mid++;
		break;
		case 2:
			swap(num,mid,end);
			end--;
			break;
		}
	
	}
	
}

private static void swap(int[] num, int start, int mid) {
	int temp=num[start];
	num[start]=num[mid];
	num[mid]=temp;
	
}
}
