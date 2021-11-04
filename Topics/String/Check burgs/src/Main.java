import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        boolean value = false;
        if (city.endsWith("burg")) {
            value = true;
        }
        System.out.println(value);
    }
}