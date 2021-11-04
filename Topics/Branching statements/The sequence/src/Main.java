import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        int numberPrinting = 1;
        int iterations = 1;
        while (counter < n) {
            for (int i = 1; i <= iterations; i++) {
                System.out.print(numberPrinting + " ");
                counter++;
                if (counter >= n) {
                    break;
                }
            }
            numberPrinting++;
            iterations++;
        }
    }
}