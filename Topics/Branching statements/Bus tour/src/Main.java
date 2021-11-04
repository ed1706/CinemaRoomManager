import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridgesCount = scanner.nextInt();
        StringBuilder sb = new StringBuilder("Will not crash");
        for (int i = 0; i < bridgesCount; i++) {
            if (scanner.nextInt() <= busHeight) {
                sb = new StringBuilder("Will crash on bridge " + (i + 1));
                break;
            }
        }
        System.out.println(sb.toString());
    }
}