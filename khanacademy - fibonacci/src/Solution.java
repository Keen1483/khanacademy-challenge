
public class Solution {

	public static void main(String[] args) {
		for (int n = 0; n <= 10; n++) {
			System.out.print(fibonacciIterative(n) + " ");
		}
	}
	
	public static int fibonacciRecursion(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
		}
	}
	
	public static int fibonacciIterative(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			int lessTwo = 0;
			int lessOne = 1;
			int current = -1;
			for (int i = 2; i <= n; i++) {
				current = lessOne + lessTwo;
				lessTwo = lessOne;
				lessOne = current;
			}
			return current;
		}
	}

}
