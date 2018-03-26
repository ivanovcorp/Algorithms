package e_01_RecursionSortingSearchAlgos;

import java.util.Scanner;

public class p_08_GeneratingVectors {

	static int counter = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] permArr = new int[n];
		
		genVector(permArr, 0);
		System.out.println("Count of permutations: " + counter);
	}
	
	public static void genVector(int[] arr, int index)
	{
		if (index == arr.length) {
			print(arr);
		} else {
			for (int i = 0; i < 2; i++) {
				arr[index] = i;
				genVector(arr, index + 1);
			}
		}
	}

	private static void print(int[] arr) {
		counter++;
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}
