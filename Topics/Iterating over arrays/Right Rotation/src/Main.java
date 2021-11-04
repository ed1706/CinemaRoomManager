import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int rotateCount = scanner.nextInt();

        int arrSize = arr.length;

        int firstIndex = 0;
        while ((firstIndex + rotateCount) % arrSize != 0) {
            firstIndex++;
        }

        int iterationsCount = 0;
        while (iterationsCount < arrSize) {
            System.out.print(arr[(firstIndex + iterationsCount) % arrSize] + " ");
            iterationsCount++;
        }

        System.out.println();
    }
}