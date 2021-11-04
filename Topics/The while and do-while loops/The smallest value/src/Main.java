import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int n = 2;
        long div = m / n;
        while (div > 0) {
            div /= ++n;
        }
        System.out.println(n);
    }
}