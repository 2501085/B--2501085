public class Compute {
    // 총점 계산 (1반 단위)
    static void calculateTotal(int[][][] score, int[][][] total) {
        int i, j, k;
        int sum;

        for(i = 0; i < score.length; i++) {
            for(j = 0; j < score[i].length; j++) {
                sum = 0;
                for(k = 0; k < 4; k++) {
                    sum = sum + score[i][j][k];
                }
                total[i][j][0] = sum;
            }
        }
    }

    // 평균 계산
    static void calculateAvg(int[][][] total, float[][] avg) {
        int i, j;
        float average;

        for(i = 0; i < total.length; i++) {
            for(j = 0; j < total[i].length; j++) {
                average = (float)total[i][j][0] / 4;
                avg[i][j] = average;
            }
        }
    }

    // 반 평균 계산
    static void calculateClassAvg(int[][][] total, float[] classAvg) {
        int i, j;
        int sum;
        float average;

        for(i = 0; i < total.length; i++) {
            sum = 0;
            for(j = 0; j < total[i].length; j++) {
                sum = sum + total[i][j][0];
            }
            average = (float)sum / total[i].length / 4;
            classAvg[i] = average;
        }
    }

    // 학년 평균 계산
    static float calculateGradeAvg(int[][][] total) {
        int i, j;
        int sum, count;
        float average;

        sum = 0;
        count = 0;

        for(i = 0; i < total.length; i++) {
            for(j = 0; j < total[i].length; j++) {
                sum = sum + total[i][j][0];
                count++;
            }
        }

        average = (float)sum / count / 4;
        return average;
    }

    // 반 석차 계산 (동점자 처리)
    static void calculateClassRank(int[][][] total, int[][] classRank) {
        int i, j, k;
        int rank;

        for(i = 0; i < total.length; i++) {
            for(j = 0; j < total[i].length; j++) {
                rank = 1;
                for(k = 0; k < total[i].length; k++) {
                    if(total[i][j][0] < total[i][k][0]) {
                        rank++;
                    }
                }
                classRank[i][j] = rank;
            }
        }
    }

    // 학년 석차 계산 (동점자 처리)
    static void calculateGradeRank(int[][][] total, int[][] gradeRank) {
        int i, j, m, n;
        int rank;

        for(i = 0; i < total.length; i++) {
            for(j = 0; j < total[i].length; j++) {
                rank = 1;
                for(m = 0; m < total.length; m++) {
                    for(n = 0; n < total[m].length; n++) {
                        if(total[i][j][0] < total[m][n][0]) {
                            rank++;
                        }
                    }
                }
                gradeRank[i][j] = rank;
            }
        }
    }

    // 학번 순으로 정렬 (버블 정렬)
    static void sortByHakbun(String[][][] students, int[][][] score, int[][][] total,
                             float[][] avg, int[][] classRank, int[][] gradeRank) {
        int i, j, k;
        String[] tempStudent;
        int[] tempScore;
        int tempTotal;
        float tempAvg;
        int tempClassRank, tempGradeRank;

        for(i = 0; i < students.length; i++) {
            for(j = 0; j < students[i].length - 1; j++) {
                for(k = j + 1; k < students[i].length; k++) {
                    if(students[i][j][0].compareTo(students[i][k][0]) > 0) {
                        // 학생 정보 교환
                        tempStudent = students[i][j];
                        students[i][j] = students[i][k];
                        students[i][k] = tempStudent;

                        // 성적 교환
                        tempScore = score[i][j];
                        score[i][j] = score[i][k];
                        score[i][k] = tempScore;

                        // 총점 교환
                        tempTotal = total[i][j][0];
                        total[i][j][0] = total[i][k][0];
                        total[i][k][0] = tempTotal;

                        // 평균 교환
                        tempAvg = avg[i][j];
                        avg[i][j] = avg[i][k];
                        avg[i][k] = tempAvg;

                        // 반석차 교환
                        tempClassRank = classRank[i][j];
                        classRank[i][j] = classRank[i][k];
                        classRank[i][k] = tempClassRank;

                        // 학년석차 교환
                        tempGradeRank = gradeRank[i][j];
                        gradeRank[i][j] = gradeRank[i][k];
                        gradeRank[i][k] = tempGradeRank;
                    }
                }
            }
        }
    }
}
