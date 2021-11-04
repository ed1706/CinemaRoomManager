import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        String result = "YES";

        for (int i = 0; i < arr.length && "YES".equals(result); i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
                if (i > j && arr[j][i] != arr[i][j]) {
                    result = "NO";
                    break;
                }
            }
        }
        System.out.println(result);
    }
}