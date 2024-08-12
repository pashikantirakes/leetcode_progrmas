package com.nikhil.lohia;

import java.util.Arrays;

public class PrintOnlyNumbers {

	public static void main(String[] args) {
		String s="ab23bfih567ekne";
		 char[] ch=s.toCharArray();
		 System.out.println("Original Array - " + Arrays.toString(ch));
		for(int i=0;i<ch.length;i++) {
			if(!Character.isAlphabetic(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
	int[] nums=	s.chars().filter(Character::isDigit)
		.map(Character::getNumericValue)
		.toArray();
	System.out.println(Arrays.toString(nums));
		 
	}
}
