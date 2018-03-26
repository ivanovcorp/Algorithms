package e_01_RecursionSortingSearchAlgos;

import java.util.Scanner;

public class p_07_Permute2 {

	public static int counter = 0;

	public static void permute(int[] input, int startindex) {
		int size = input.length;

		if (size == startindex + 1) {
			System.out.println(counter + "Permutation is");
			for (int i = 0; i < size; i++) {
				System.out.print(input[i] + ",  ");
			}
			System.out.println();
			System.out.println("##########################");
			counter++;
		} else {
			for (int i = startindex; i < size; i++) {

				int temp = input[i];
				input[i] = input[startindex];
				input[startindex] = temp;
				permute(input, startindex + 1);
				temp = input[i];
                input[i] = input[startindex];
                input[startindex] = temp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input array Length");
		int arraylength = in.nextInt();
		int[] input = new int[arraylength];
		for (int i = 0; i < arraylength; i++) {
			input[i] = in.nextInt();
		}
		counter = 0;
		permute(input, 0);
		System.out.println(counter + "  number of permutations obtained");
	}
}