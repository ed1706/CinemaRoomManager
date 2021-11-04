import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int largestElem = 0;
        while ((number = scanner.nextInt()) != 0) {
            if (number > largestElem) {
                largestElem = number;
            }
        }
        System.out.println(largestElem);
    }
}