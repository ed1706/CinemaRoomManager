import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String reverseNumberStr = new StringBuilder(String.valueOf(number)).reverse().toString();
        int reverseNumber = Integer.parseInt(reverseNumberStr);
        if (number == reverseNumber) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}