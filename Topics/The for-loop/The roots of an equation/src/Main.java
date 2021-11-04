import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int rootsCount = 0;
        int root = 0;

        while (rootsCount <= 3 && root <= 1000) {
            if (cubicEquation(a, b, c, d, root)) {
                System.out.println(root);
                rootsCount++;
            }
            root++;
        }
    }

    public static boolean cubicEquation(int a, int b, int c, int d, int x) {
        return a * x * x * x + b * x * x + c * x + d == 0;
    }
}