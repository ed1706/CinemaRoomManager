import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int packBottom = 1;
        final int packUpper = 19;
        final int throngBottom = 20;
        final int throngUpper = 249;
        final int zoundsBottom = 250;
        final int zoundsUpper = 999;

        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (units < 1) {
            sb.append("no army");
        } else if (units >= packBottom && units <= packUpper) {
            sb.append("pack");
        } else if (units >= throngBottom && units <= throngUpper) {
            sb.append("throng");
        } else if (units >= zoundsBottom && units <= zoundsUpper) {
            sb.append("zounds");
        } else {
            sb.append("legion");
        }
        System.out.println(sb.toString());
    }
}