import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int gradeA = 5;
        final int gradeB = 4;
        final int gradeC = 3;
        final int gradeD = 2;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grade;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        for (int i = 1; i <= n; i++) {
            grade = sc.nextInt();
            switch (grade) {
                case gradeD:
                    countD++;
                    break;
                case gradeC:
                    countC++;
                    break;
                case gradeB:
                    countB++;
                    break;
                case gradeA:
                    countA++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(countD + " "
            + countC + " "
            + countB + " " + countA);
    }
}