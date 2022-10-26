package Algorithms;
/* 2/ ROMAN NUMBER 
level chưa làm : chỉ cần find solution (algorithm + bigO)
Làm rồi : APPLY TDD
Tự RESEARCH : HOW TO WRITE UNIT TEST IN JAVA */

import java.util.*;   
import java.io.*;   
import java.lang.Math;  

public class Hw8RomanNumber {

	public static void main(String[] args) {
		String s = "XIII";
		int romanToInt = romanToInt(s);
		System.out.println(romanToInt);

	}

	public static int romanToInt(String s) {

	int value(char r) {
		 if (r == 'I')   
		      return 1;   
		 if (r == 'V')   
		      return 5;   
		 if (r == 'X')   
		      return 10;   
		 if (r == 'L')   
		      return 50;   
		    if (r == 'C')   
		      return 100;   
		    if (r == 'D')   
		      return 500;   
		    if (r == 'M')   
		      return 1000;   
		    return -1;   
	}
	
		int total = 0;
		for (int i = 0; i < s.length(); i++) {
			int s1 = value(s.charAt(i));
			if (i + 1 < s.length()) {
				int s2 = value(s.charAt(i + 1));
				if (s1 >= s2) {
					total = total + s1;
				} else {
					total = total - s1;
				}
				
			}
		}
		return total;
	}

}
