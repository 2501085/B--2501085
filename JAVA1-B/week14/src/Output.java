public class Output {
    static void printResult(String[][][] students, int[][][] score, int[][][] total,
                            float[][] avg, int[][] classRank, int[][] gradeRank,
                            float[] classAvg, float gradeAvg) {
        int i;

        for(i = 0; i < students.length; i++) {
            printClassResult(i + 1, students[i], score[i], total[i], avg[i],
                    classRank[i], gradeRank[i], classAvg[i]);
            printDivider();
        }

        System.out.printf("학년 전체 평균: %.2f\n", gradeAvg);
    }

    // 반별 성적표 출력
    static void printClassResult(int classNum, String[][] students, int[][] score,
                                 int[][] total, float[] avg, int[] classRank,
                                 int[] gradeRank, float classAvg) {
        int i;

        System.out.printf("\n*** %d반 성적표 ***\n", classNum);
        printLine();
        System.out.printf(" 학번    이름   국어 영어 수학 선택 총점  평균  반석차 학년석차 기타\n");
        printLine();

        for(i = 0; i < students.length; i++) {
            System.out.printf("%s %s %3d %3d %3d %3d %3d %6.2f %3d %5d",
                    students[i][0], students[i][1],
                    score[i][0], score[i][1], score[i][2], score[i][3],
                    total[i][0], avg[i], classRank[i], gradeRank[i]);

            // 반평균 미만 체크
            if(avg[i] < classAvg) {
                System.out.printf(" 반평균 미만");
            }
            System.out.println();
        }

        printLine();
        System.out.printf("%d반 전체 평균: %.2f\n", classNum, classAvg);
    }

    // 구분선 출력
    static void printLine() {
        System.out.println("*****************************************************************");
    }

    // 점선 구분 출력
    static void printDivider() {
        System.out.println(".................................................................");
    }
}
