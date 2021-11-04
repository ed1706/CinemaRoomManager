import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sequenceSize = sc.nextInt();

        int[] array = new int[sequenceSize];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int count;
        int maxCount = 1;
        int i = 0;
        while (i < array.length - 1) {
            count = 1;
            while (i < array.length - 1 && array[i] < array[i + 1]) {
                i++;
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
            }
            i++;
        }
        System.out.println(maxCount);
    }
}