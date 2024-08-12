package com.nikhil.lohia;

public class DeleteOneLetterMakePalindrome {
	public static void main(String[] args) {
		String s="rotatxor";
		boolean isValid=validPalindrome(s);
		System.out.println(isValid);
	}

	private static boolean validPalindrome(String s) {
          int left=0;
          int right=s.length()-1;
          while(left<right) {
        	  if(s.charAt(left)==  s.charAt(right)) {
        		  left++;
        	  right--;
        	  }else {
        		  //try to delete 1 char from left or right direction
        		  return isPalin(s,left+1,right) ||isPalin( s,left,right-1);
        	  }
          }
		return true;
	}

	private static boolean isPalin(String s, int left, int right) {
		while(left<right) {
			if(s.charAt(left)== s.charAt(right)) {
      		  left++;
      	  right--;
      	  }else {
      		  return false;
      	  }
		}
		return true;
	}

}
