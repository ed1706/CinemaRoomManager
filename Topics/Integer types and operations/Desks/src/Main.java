import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] groups = new int[3];
        for (int i = 0; i < groups.length; i++) {
            groups[i] = scanner.nextInt();
        }
        int desksCount = Arrays.stream(groups).map(groupCount -> groupCount / 2 + groupCount % 2).sum();
        System.out.println(desksCount);
    }
}