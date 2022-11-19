import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
            arr2[i] = (int) (Math.random() * 100);
        }
        int[] arr3 = new int[20];
        // add to arrays to arr3 array
        //         System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        //        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr3.length; i++) {
            min = Math.min(min, arr3[i]);
            max = Math.max(max, arr3[i]);
        }
        int[] arr5 = new int[max - min + 1];
        String s = "";
        for (int i = 0; i < arr5.length; i++) {
            boolean isExist = false;
            for (int j = 0; j < arr3.length; j++) {
                if (arr3[j] == min + i) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                s += (min + i) + " ";
            }
        }
        String[] arr4 = s.split(" ");
        int[] result = new int[arr4.length];
        for (int i = 0; i < arr4.length; i++) {
            result[i] = Integer.parseInt(arr4[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}