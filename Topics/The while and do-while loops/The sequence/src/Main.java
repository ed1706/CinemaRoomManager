import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int divider = 4;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxNumber = 0;
        int currentNumber;

        int i = 1;
        while (i <= n) {
            currentNumber = sc.nextInt();
            if (currentNumber > maxNumber && currentNumber % divider == 0) {
                maxNumber = currentNumber;
            }
            i++;
        }
        System.out.println(maxNumber);
    }
}