package e_01_RecursionSortingSearchAlgos;

public class p_02_FactorielRecursive {
	
	public static void main(String[] args) {
		System.out.println(calculateFactoriel(5));
	}
	
	public static long calculateFactoriel(long n) {
		if (n < 2) {
			return 1;
		}
		return n * calculateFactoriel(n - 1);
	}
}
