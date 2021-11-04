import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reverseNumber = new StringBuilder(scanner.next()).reverse().toString();
        //System.out.println(reverseNumber);

        System.out.println(Integer.parseInt(reverseNumber));
    }
}