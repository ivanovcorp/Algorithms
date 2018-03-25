package e_01_RecursionSortingSearchAlgos;

public class p_03_RecursiveDrawing {

	private static final String drawChar = "*";
	private static final String drawChar2 = "#";
	
	public static void main(String[] args) {
		
		drawRecursively(5);
	}
	
	public static void drawRecursively(int n) {
		
		for (int i = n; i > 0; i--) {
			System.out.print(drawChar);
		}
		if (n < 1) {
			return;
		}
		System.out.println();
		drawRecursively(n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(drawChar2);
		}
		System.out.println();
	}
}
