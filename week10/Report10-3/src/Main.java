import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // 상수 정의
        final int STUDENT_COUNT = 10;
        final double WEIGHT_MIDTERM = 0.15;
        final double WEIGHT_FINAL = 0.15;
        final double WEIGHT_QUIZ = 0.10;
        final double WEIGHT_REPORT = 0.40;
        final double WEIGHT_ATTENDANCE = 0.20;

        // 배열 선언
        String[] studentId = new String[STUDENT_COUNT];
        String[] name = new String[STUDENT_COUNT];
        int[] midterm = new int[STUDENT_COUNT];
        int[] finalExam = new int[STUDENT_COUNT];
        int[] quiz = new int[STUDENT_COUNT];
        int[] report = new int[STUDENT_COUNT];
        int[] attendance = new int[STUDENT_COUNT];
        double[] totalScore = new double[STUDENT_COUNT];

        // 데이터 입력
        System.out.printf("===== JAVA 성적 입력 =====\n");
        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.printf("\n[%d번 학생]\n", i + 1);

            System.out.printf("학번: ");
            studentId[i] = keyboard.next();

            System.out.printf("이름: ");
            name[i] = keyboard.next();

            System.out.printf("중간고사: ");
            midterm[i] = keyboard.nextInt();

            System.out.printf("기말고사: ");
            finalExam[i] = keyboard.nextInt();

            System.out.printf("퀴즈: ");
            quiz[i] = keyboard.nextInt();

            System.out.printf("과제: ");
            report[i] = keyboard.nextInt();

            System.out.printf("출석: ");
            attendance[i] = keyboard.nextInt();

            // 가중치 총점 계산
            totalScore[i] = midterm[i] * WEIGHT_MIDTERM +
                    finalExam[i] * WEIGHT_FINAL +
                    quiz[i] * WEIGHT_QUIZ +
                    report[i] * WEIGHT_REPORT +
                    attendance[i] * WEIGHT_ATTENDANCE;
        }

        // 버블 정렬 (내림차순)
        for (int i = 0; i < STUDENT_COUNT - 1; i++) {
            for (int j = 0; j < STUDENT_COUNT - 1 - i; j++) {
                if (totalScore[j] < totalScore[j + 1]) {
                    // 총점 교환
                    double tempScore = totalScore[j];
                    totalScore[j] = totalScore[j + 1];
                    totalScore[j + 1] = tempScore;

                    // 학번 교환
                    String tempId = studentId[j];
                    studentId[j] = studentId[j + 1];
                    studentId[j + 1] = tempId;

                    // 이름 교환
                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;

                    // 중간 교환
                    int tempMid = midterm[j];
                    midterm[j] = midterm[j + 1];
                    midterm[j + 1] = tempMid;

                    // 기말 교환
                    int tempFinal = finalExam[j];
                    finalExam[j] = finalExam[j + 1];
                    finalExam[j + 1] = tempFinal;

                    // 퀴즈 교환
                    int tempQuiz = quiz[j];
                    quiz[j] = quiz[j + 1];
                    quiz[j + 1] = tempQuiz;

                    // 과제 교환
                    int tempReport = report[j];
                    report[j] = report[j + 1];
                    report[j + 1] = tempReport;

                    // 출석 교환
                    int tempAtt = attendance[j];
                    attendance[j] = attendance[j + 1];
                    attendance[j + 1] = tempAtt;
                }
            }
        }

        // 결과 출력
        System.out.printf("\n");
        System.out.printf("*******************************************************\n");
        System.out.printf("학번\t이름\t중간\t기말\t퀴즈\t과제\t출석\t점수\n");
        System.out.printf("*******************************************************\n");

        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
                    studentId[i], name[i], midterm[i], finalExam[i],
                    quiz[i], report[i], attendance[i], totalScore[i]);
        }

        System.out.printf("*******************************************************\n");

        keyboard.close();
    }
}