public class Ex4 {
	public static void main(String[] args) {
		int[][] tab = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		spiral(tab, 0, 0, tab.length, tab[0].length);
	}

	public static void spiral(int[][] arr, int i, int j, int iMax, int jMax) {
		if (i >= iMax || j >= jMax) {
			return;
		}
		for (int q = i; q < jMax; q++) {
			System.out.print(arr[i][q] + " ");
		}
		for (int q = i + 1; q < iMax; q++) {
			System.out.print(arr[q][jMax - 1] + " ");
		}
		if ((iMax - 1) != i) {
			for (int q = jMax - 2; q >= j; q--) {
				System.out.print(arr[iMax - 1][q] + " ");
			}
		}
		if ((jMax - 1) != j) {
			for (int q = iMax - 2; q > i; q--) {
				System.out.print(arr[q][j] + " ");
			}
		}
		spiral(arr, i + 1, j + 1, iMax - 1, jMax - 1);
	}
}
