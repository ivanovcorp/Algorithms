package e_01_RecursionSortingSearchAlgos;

public class p_06_RecursiveFibonacci {
	
	public static void main(String[] args) {
		// This algorithm is ineffective
		int n = 40;
		System.out.println("Number " + n + " of Fibonacci is: " + getFibonacci(n));
		System.out.println("Number " + n + " of Fibonacci is: " + getFibonacciIterative(n));
	}
	
	private static long getFibonacciIterative(int n) {
		long f1 = 0;
		long f2 = 1;
		while (n-- >= 0) {
			f2 = f1 + f2;
			f1 = f2 - f1;			
		}
		return f1;
	}

	private static long getFibonacci(int n) {
		if (n < 2) {
			return 1;
		} else {
			return getFibonacci(n - 1) + getFibonacci(n - 2);
		}
	}
}
