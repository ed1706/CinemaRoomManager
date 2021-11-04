import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        boolean firstDiffSecond = n1 != n2;
        boolean secondDiffThird = n2 != n3;
        boolean firstDiffThird = n1 != n3;
        System.out.println(firstDiffSecond && secondDiffThird
            && firstDiffThird);
    }
}