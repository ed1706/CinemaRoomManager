import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = "False";
        if (number > -15 && number <= 12
            || number > 14 && number < 17
            || number >= 19) {
            result = "True";
        }
        System.out.println(result);
    }
}