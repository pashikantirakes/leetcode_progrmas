package com.nikhil.lohia;

import java.util.HashSet;
import java.util.Set;

public class MaxVowelsInString {
	public static void main(String[] args) {
		String s="abciiidef";
		int target=3;
		int res=maxVowels(s,target);
		System.out.println(res);
	}

	private static int maxVowels(String s, int k) {
		
		int windowVowel=0;
		int maxVowel=0;
		Set<Character>set=new HashSet<>();
		set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
		//Count the vowels in 1st window
		 for(int i=0;i<k;i++)
			  if(set.contains(s.charAt(i)))
				  windowVowel++;
		 maxVowel=windowVowel;
		 
		 //Slide the window and update the max vowels
		   for(int i=k;i<s.length();i++) {
			   if(set.contains(s.charAt(i-k)))
				   windowVowel--;
			   if(set.contains(s.charAt(i)))
				   windowVowel++;
			   maxVowel=Math.max(maxVowel, windowVowel);
		   }
		return maxVowel; // iii =3
		
	}

}
