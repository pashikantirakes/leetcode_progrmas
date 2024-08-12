package com.nikhil.lohia;

import java.util.Stack;

public class ReverseFirstPrefixLetters {
	public static void main(String[] args) {
		
		 // o/p :dcbaefg 
		String s="abcdefg";
		char ch='d';
		String res=  reversePrefix(s,ch);
		System.out.println(res);
	}

	private static String reversePrefix(String word, char ch) {
		// TODO Auto-generated method stub
		  int wordOccurance=word.indexOf(ch);
		  if(wordOccurance == -1)
			  return word;
		  /*
		   *   Stack push = a/b/c/d  <--  pop = d/c/b/a 
		   */
		  Stack<Character> st=new Stack<>();
		  //Add elements to stack up to char - d
		  for(int i=0;i<=wordOccurance;i++)
			  st.push(word.charAt(i));
		  
		  StringBuilder result=new StringBuilder();
		  //add letters to stack using Pop().
		  while(!st.isEmpty())
			  result.append(st.pop());
		  
		  //add remaining letters to StringBuilder
		   for(int i=wordOccurance+1;i<word.length();i++)
			   result.append(word.charAt(i));
		   
		return result.toString();
	}
 
}
