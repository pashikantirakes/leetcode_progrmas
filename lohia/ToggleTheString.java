package com.nikhil.lohia;


public class ToggleTheString {
	public static void main(String[] args) {
		String s="Hello JAva";
		 String res= toogleString(s);
		 System.out.println(res);
	}

	private static String toogleString(String s) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch)) {
				sb.append(Character.toUpperCase(ch));
			}else {
				sb.append(Character.toLowerCase(ch));
			}
		}
		return sb.toString();
	}

}
