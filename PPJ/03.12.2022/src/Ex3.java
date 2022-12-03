import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {
		int[][] tab = { { 1, 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1 } };
		int[] result = new int[12];
		int index = 0;
		for (int[] ints : tab) {
			for (int anInt : ints) {
				result[index] = anInt;
				index++;
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
