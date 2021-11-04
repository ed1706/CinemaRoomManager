import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstBox = new int[3];
        int[] secondBox = new int[3];
        arrayInitialization(scanner, firstBox);
        arrayInitialization(scanner, secondBox);

        if (oneBoxInsideOtherBox(firstBox, secondBox)) {
            System.out.println("Box 1 < Box 2");
        } else if (oneBoxInsideOtherBox(secondBox, firstBox)) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }

    public static void arrayInitialization(Scanner scanner, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean oneBoxInsideOtherBox(int[] oneBox, int[] otherBox) {
        Arrays.sort(oneBox);
        Arrays.sort(otherBox);
        for (int i = 0; i < oneBox.length; i++) {
            if (oneBox[i] >= otherBox[i]) {
                return false;
            }
        }

        return true;
    }
}