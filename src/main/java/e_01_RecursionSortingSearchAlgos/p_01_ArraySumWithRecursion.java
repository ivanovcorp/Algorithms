package e_01_RecursionSortingSearchAlgos;

public class p_01_ArraySumWithRecursion {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(sum(nums));
	}
	
	public static int sum(int[] arr) {
		return sumOfArray(arr, 0);
	}
	
	public static int sumOfArray(int[] arr, int index) {
		if (index == arr.length - 1) {
			return arr[index];
		}
		
		return arr[index] + sumOfArray(arr, index + 1);
	}

}
