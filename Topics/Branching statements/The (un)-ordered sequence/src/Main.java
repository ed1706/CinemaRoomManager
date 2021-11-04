import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        String order = null;
        boolean ordered = true;
        while (secondNumber != 0) {
            if (order == null) {
                if (firstNumber > secondNumber) {
                    order = "desc";
                } else if (secondNumber > firstNumber) {
                    order = "asc";
                }
            } else if ("asc".equals(order)) {
                if (firstNumber > secondNumber) {
                    ordered = false;
                    break;
                }
            } else {
                if (secondNumber > firstNumber) {
                    ordered = false;
                    break;
                }
            }
            if (scanner.hasNextInt()) {
                firstNumber = secondNumber;
                secondNumber = scanner.nextInt();
            }
        }
        System.out.println(ordered);
    }
}
