import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int upSteps = scanner.nextInt();
        int downSteps = scanner.nextInt();

        int delta = upSteps - downSteps;
        int remainder = height - upSteps;

        int daysCount = remainder / delta + (remainder % delta > 0 ? 1 : 0) + 1;
        System.out.println(daysCount);
    }
}