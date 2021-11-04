import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] revenue = new int[n];
        int[] taxes = new int[n];
        Main.fillIntArray(revenue, scanner);
        Main.fillIntArray(taxes, scanner);

        int num = 1;
        double maxTax = 0.0;
        double tax;

        for (int i = 0; i < n; i++) {
            if (revenue[i] == 0 || taxes[i] == 0) {
                tax = 0.0;
            } else {
                tax = ((double) revenue[i] / 100.0) * ((double) taxes[i]);
            }
            if (tax > maxTax) {
                num = i + 1;
                maxTax = tax;
            }
        }
        System.out.println(num);
    }

    public static void fillIntArray(int[] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }
}