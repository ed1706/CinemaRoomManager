import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] intArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = sc.nextInt();
        }

        int triplesCount = 0;
        for (int i = 0; i < arraySize - 2; i++) {
            if (intArray[i + 1] - intArray[i] == 1
                && intArray[i + 2] - intArray[i + 1] == 1) {
                triplesCount++;
            }
        }
        System.out.println(triplesCount);
    }
}