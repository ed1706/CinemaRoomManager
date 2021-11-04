import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();

        double incSum = m;
        double stopSum = k;
        int yearsCount = 0;
        while (incSum < stopSum) {
            incSum += incSum * p / 100;
            yearsCount++;
        }
        System.out.println(yearsCount);
    }
}