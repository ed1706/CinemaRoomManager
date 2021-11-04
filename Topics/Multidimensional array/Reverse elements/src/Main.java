import java.util.*;

class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        int temp;
        int length;
        for (int[] arr : twoDimArray) {
            length = arr.length;
            for (int i = 0; i < length / 2; i++) {
                temp = arr[i];
                arr[i] = arr[length - 1 - i];
                arr[length - 1 - i] = temp;
            }
        }
    }
}