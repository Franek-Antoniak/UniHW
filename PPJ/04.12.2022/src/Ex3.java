import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[rand.nextInt(0, 100)][rand.nextInt(0, 100)];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt();
            }
        }
        System.out.println(jestRowna(arr, arr));
        System.out.println(jestRowna(arr, new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }

    public static boolean jestRowna(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != arr2[i].length) {
                return false;
            }
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
