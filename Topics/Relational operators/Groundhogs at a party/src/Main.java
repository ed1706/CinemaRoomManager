import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int peanutButterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean notWeekendConditions = peanutButterCups >= 10
                && peanutButterCups <= 20 && !isWeekend;
        boolean weekendConditions = peanutButterCups >= 15
                && peanutButterCups <= 25 && isWeekend;
        System.out.println(notWeekendConditions || weekendConditions);
    }
}