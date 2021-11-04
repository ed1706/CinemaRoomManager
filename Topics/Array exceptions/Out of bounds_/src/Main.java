import java.util.*;

class FixingStringIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();
        boolean indexOutOfBounds = index < 0 || index > string.length() - 1;
        System.out.println(indexOutOfBounds ? "Out of bounds!" : string.charAt(index));
    }
}