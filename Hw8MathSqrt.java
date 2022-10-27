package Algorithms;

/* •Write your own Math.sqrt(int num) func
•The Result could be the exactResult +- 0.01
- Calculate Time Complexity  */

// O(n)

public class Hw8MathSqrt {

	public static void main(String[] args) {
		int num = 957;
		double squareRoot = getSquareRoot(num);
		System.out.println("Square root of " + num + " is " + squareRoot);
	}

	public static double getSquareRoot(int num) {

		double squareRoot = 0.00;
		double quotient = 0.00;

		for (int i = 100; i <= 100 * num; i++) {
			double temp = (double) i / 100;
			quotient = num / temp;

			if (quotient == 1) {
				squareRoot = num;
				return squareRoot;
			} else if (Math.abs(quotient - temp) < 0.02) {
				squareRoot = temp;
				return squareRoot;
			}

		}

		return -1;
	}

}
