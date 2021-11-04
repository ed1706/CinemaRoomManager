import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean firstCondition = a + b > c;
        boolean secondCondition = a + c > b;
        boolean thirdCondition = b + c > a;
        boolean isTriangle = firstCondition
                && secondCondition
                && thirdCondition;
        if (isTriangle) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}