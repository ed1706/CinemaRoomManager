import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;
        while ((number = sc.nextInt()) != 0 && sum < 1000) {
            sum += number;
        }
        System.out.println(sum < 1000 ? sum : sum - 1000);
    }
}