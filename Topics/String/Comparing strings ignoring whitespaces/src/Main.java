import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstString = sc.nextLine();
        String secondString = sc.nextLine();
        boolean value = false;
        if (firstString.replace(" ", "").equals(secondString.replace(" ", ""))) {
            value = true;
        }
        System.out.println(value);
    }
}