package Algorithms;
/* 2/ ROMAN NUMBER 
level chưa làm : chỉ cần find solution (algorithm + bigO)
Làm rồi : APPLY TDD
Tự RESEARCH : HOW TO WRITE UNIT TEST IN JAVA */

// O(1) - because Roman numerals are limited so it will always take a fixed time with a limit.

public class Hw8RomanNumber {

	public static void main(String[] args) {
		String roman = "CCCLIX";
		int intNum = romanToInt(roman);
		System.out.println("the corresponding integer to the roman numeral " + roman + " is " + intNum);

	}

	public static int letterToNumber(char letter) {

		switch (letter) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}

	public static int romanToInt(String roman) {
		int total = 0;
		for (int i = 0; i < roman.length(); i++) {
			char letter = roman.charAt(i);
			int number = letterToNumber(letter);
			if (i + 1 == roman.length()) {
				total = total + number;
			} else if (i + 1 < roman.length()) {
				int nextNumber = letterToNumber(roman.charAt(i + 1));
				if (number >= nextNumber) {
					total = total + number;
				} else {
					total = total - number;
				}

			}
		}
		return total;
	}

}
