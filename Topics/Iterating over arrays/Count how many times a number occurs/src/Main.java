import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] intArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int occurs = 0;
        for (int value : intArray) {
            if (value == n) {
                occurs++;
            }
        }
        System.out.println(occurs);
    }
}