package com.nikhil.lohia;

import java.util.HashMap;
import java.util.Map;

public class CompressString {
	public static void main(String[] args) {
		String s="aaabbccc";
	// compressString(s);
	//compressStringAnothrt(s);
	 String str="a3b2c4d1";
	 expandString(str);
	}

	private static void expandString(String str) {
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}else {
				int x=Character.getNumericValue(str.charAt(i));
				for(int j=1;j<x;j++) {
					System.out.print(str.charAt(i-1));
				}
			}
			
		}
		
	}

	private static void compressStringAnothrt(String s) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		map.forEach((k,v)->System.out.print(k+""+v));
		
	}

	private static void compressString(String s) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				count++;
				map.replace(ch, count);
				
			}else {
				map.put(ch,1);
			}
		}
		for(Character ck : map.keySet()) {
			System.out.print(ck+""+ map.get(ck) );
		}
	}

}
