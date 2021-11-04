import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int chocolateArea = n * m;
        if (chocolateArea < k) {
            System.out.println("NO");
        } else {
            boolean divideVertical = k % m == 0;
            boolean divideHorizontal = k % n == 0;
            if (divideHorizontal || divideVertical) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}