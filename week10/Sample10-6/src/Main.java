import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);

        String[][] students = {
                {"홍길동","2501002"},{"이재명","2501004"},{"윤석열","2501005"},{"경복대","2501014"},
                {"오세훈","2501024"},{"강민성","2501032"},{"김진성","2501044"},{"니키타","2501055"},
                {"김정은","2501064"},{"김시온","2501074"}
        };

        // score[i] = {국어, 영어, 수학, 총점}
        int[][] score = new int[students.length][4];
        float[] avg = new float[students.length];
        int[] rank = new int[students.length];
        boolean swapped;

        int i = 0;
        // 성적 입력
        while (i < students.length) {
            System.out.printf("%s 학생의 국어 성적 입력 : ", students[i][0]);
            score[i][0] = keyboard.nextInt();
            System.out.printf("%s 학생의 영어 성적 입력 : ", students[i][0]);
            score[i][1] = keyboard.nextInt();
            System.out.printf("%s 학생의 수학 성적 입력 : ", students[i][0]);
            score[i][2] = keyboard.nextInt();

            if ((score[i][0] >= 0 && score[i][0] <= 100) &&
                    (score[i][1] >= 0 && score[i][1] <= 100) &&
                    (score[i][2] >= 0 && score[i][2] <= 100)) {
                i++;
            } else {
                System.err.println("ERROR : 0 ~ 100");
                System.in.read();
            }
        }

        // 총점 계산
        for (i = 0; i < students.length; i++) {
            score[i][3] = score[i][0] + score[i][1] + score[i][2];
        }

        // 평균 계산
        for (i = 0; i < students.length; i++) {
            avg[i] = score[i][3] / 3.0f;
        }

        // 평균 기준 내림차순 정렬 (버블 정렬)
        for (i = 0; i < students.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (avg[j] < avg[j + 1]) {
                    // avg 교환
                    float tempAvg = avg[j];
                    avg[j] = avg[j + 1];
                    avg[j + 1] = tempAvg;

                    // score 교환 (국어, 영어, 수학, 총점)
                    int[] tempScore = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = tempScore;

                    // students 교환 (이름, 학번)
                    String[] tempStudent = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tempStudent;

                    swapped = true;
                }
            }
            if (!swapped) break;  // 교환 없으면 종료
        }

        // 등수 초기화
        for (i = 0; i < students.length; i++) {
            rank[i] = i + 1;
        }

        // 동점자 처리 (같은 평균이면 같은 등수)
        for (i = 0; i < students.length - 1; i++) {
            if (avg[i] == avg[i + 1]) {
                rank[i + 1] = rank[i];
            }
        }

        // 성적표 출력
        System.out.println("*****************************************************");
        System.out.println("학번      이름    국어  영어  수학  총점   평균  등수");
        System.out.println("*****************************************************");
        for (i = 0; i < students.length; i++) {
            System.out.printf("%7s %4s  %3d  %3d  %3d  %3d  %5.1f  %2d\n",
                    students[i][1],  // 학번
                    students[i][0],  // 이름
                    score[i][0], score[i][1], score[i][2], score[i][3],
                    avg[i], rank[i]);
        }
        System.out.println("*****************************************************");

        keyboard.close();
    }
}