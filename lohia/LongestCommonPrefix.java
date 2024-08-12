package com.nikhil.lohia;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] str= {"clove","club","clap"};
		String res=  commonPrefix(str);
		System.out.println(res);
	}

	private static String commonPrefix(String[] str) {

		/*
		 * 1st=   str[0]={"clap"},
		 *   str[1]= {"clove"};
		 *  last= str[2]={"club"};
		 */
   Arrays.sort(str);
   StringBuilder sb=new StringBuilder();
   //Get the first and last strings
   char[] first=str[0].toCharArray();
   char[] last=str[str.length-1].toCharArray();
     for(int i=0;i<first.length;i++) {
    	 if(first[i]!=last[i])
    		 break;
    	 sb.append(first[i]);
     }
       
		return sb.toString();
	}

}
