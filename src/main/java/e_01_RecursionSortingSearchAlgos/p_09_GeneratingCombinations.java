package e_01_RecursionSortingSearchAlgos;

public class p_09_GeneratingCombinations {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int k = 2;
		int[] combination = new int[k];
		genCombinations(nums, 0, combination);
	}

	private static void genCombinations(int[] nums, int index, int[] combination) {
		if (index == nums.length - 2) {
			return;
		} else {			
			combination[0] = nums[index]; 
			for (int i = index + 1; i < nums.length; i++) {
				combination[1] = nums[index + i];			
				print(combination);
			}
			genCombinations(nums, index + 1, combination);
		}
		
	}
	
	private static void print(int[] vector) {
		for (int x : vector) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
