package etc;

import util.ArrayUtils;

public class MatrixProduct {

	public static void main(String[] args) {
		MatrixProduct mp = new MatrixProduct();

		int[][] arrayA = { { 2, 3, 8 }, { 4, 1, 2 } };
		int[][] arrayB = { { 5, 7 }, { 6, 8 }, { 9, 8 } };
		int[][] arrayResult = new int[arrayA.length][arrayA[0].length];

		mp.product(arrayA, arrayB, arrayResult);
		System.out.format("%s x %s = %s", ArrayUtils.printArray(arrayA), ArrayUtils.printArray(arrayB),
				ArrayUtils.printArray(arrayResult));
	}

	private void product(int[][] a, int[][] b, int[][] c) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int k = 0; k < a[i].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
	}
}