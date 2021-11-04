import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean value = false;
        if (str.startsWith("J") || str.startsWith("j")) {
            value = true;
        }
        System.out.println(value);
    }
}