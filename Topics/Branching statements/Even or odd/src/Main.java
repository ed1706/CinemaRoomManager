import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        StringBuilder sb = new StringBuilder();
        while ((number = scanner.nextInt()) != 0) {
            if (number % 2 == 0) {
                sb.append("even\n");
            } else {
                sb.append("odd\n");
            }
        }
        System.out.println(sb.toString());
    }
}