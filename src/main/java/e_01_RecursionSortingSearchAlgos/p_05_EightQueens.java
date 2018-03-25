package e_01_RecursionSortingSearchAlgos;

import java.util.HashSet;
import java.util.Set;

public class p_05_EightQueens {
	static final int size = 8;
	static boolean[][] chessBoad = new boolean[size][size];
	static Set<Integer> attRows = new HashSet<>();
	static Set<Integer> attCols = new HashSet<>();
	static Set<Integer> attLDiagonals = new HashSet<>();
	static Set<Integer> attRDiagonals = new HashSet<>();
	static int solutionsFound = 0;
	
	public static void main(String[] args) {
		putQueens(0);
		System.out.println("Found soulutions: " + solutionsFound);
	}
	
	static void putQueens(int row) {
		if (row == size) {
			printSolution();
		} else {
			for (int col = 0; col < size; col++) {
				if (canPlaceQueen(row, col)) {
					markAllAttPositions(row, col);
					putQueens(row + 1);
					unmarkAllAttPositions(row, col);
				}
			}
		}
	}


	private static void unmarkAllAttPositions(int row, int col) {
		attRows.remove(row);
		attCols.remove(col);
		attLDiagonals.remove(col - row);
		attRDiagonals.remove(row + col);
		chessBoad[row][col] = false;
		
	}


	private static void markAllAttPositions(int row, int col) {
		attRows.add(row);
		attCols.add(col);
		attLDiagonals.add(col - row);
		attRDiagonals.add(row + col);
		chessBoad[row][col] = true;
		
	}


	private static boolean canPlaceQueen(int row, int col) {
		boolean positionOccupied = attRows.contains(row) || 
				attCols.contains(col) ||
				attLDiagonals.contains(col - row) ||
				attRDiagonals.contains(row + col);
		return !positionOccupied;
	}


	private static void printSolution() {
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				if (chessBoad[row][col]) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		System.out.println();
		solutionsFound++;
	}
}
