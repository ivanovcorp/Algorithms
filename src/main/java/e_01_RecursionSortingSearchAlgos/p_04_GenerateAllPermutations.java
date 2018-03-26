package e_01_RecursionSortingSearchAlgos;

public class p_04_GenerateAllPermutations {

	public static void main(String[] args) {	
		int[] arr = new int[3];
		generate(0, arr);
	}
	
	public static void generate(int index, int[] arr) {
		if (index == arr.length) {
			print(arr);
		} else {
			for (int i = 1; i <= 3; i++) {
				arr[index] = i;
				generate(index + 1, arr);
			}
		}
	}

	public static void print(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
