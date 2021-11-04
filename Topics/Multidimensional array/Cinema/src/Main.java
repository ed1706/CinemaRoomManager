import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] cinema = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();

        int cinemaRow = 0;
        int i = 0;
        while (i < cinema.length && !isAvailableRow(k, cinema[i])) {
            i++;
        }
        if (i < cinema.length) {
            cinemaRow = i + 1;
        }
        System.out.println(cinemaRow);
    }

    public static boolean isAvailableRow(int k, int[] arr) {
        boolean isAvailableRow = false;
        int i = 0;
        int j;
        int length = arr.length;
        int count = 0;
        while (k <= (length - i) && !isAvailableRow) {
            if (arr[i] == 0) {
                count++;
                j = i + 1;
                while (j < length && count < k && arr[j] == 0) {
                    j++;
                    count++;
                }
                if (count >= k) {
                    isAvailableRow = true;
                }
                count = 0;
                i = j + 1;
            } else {
                i++;
            }
        }

        return isAvailableRow;
    }
}