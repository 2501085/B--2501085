import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // 변수 선언
        final int STUDENT_COUNT = 10;
        int[] score = new int[STUDENT_COUNT];
        int total = 0;
        float average;
        int max, min;

        // 성적 입력
        System.out.printf("===== 학생 성적 입력 =====\n");
        System.out.printf("10명의 JAVA 성적을 입력하세요\n\n");

        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.printf("%d번 학생: ", i + 1);
            score[i] = keyboard.nextInt();
        }

        // 합계 계산
        for (int i = 0; i < STUDENT_COUNT; i++) {
            total += score[i];
        }

        // 평균 계산
        average = (float) total / STUDENT_COUNT;

        // 최대값 찾기
        max = score[0];
        for (int i = 1; i < STUDENT_COUNT; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }

        // 최소값 찾기
        min = score[0];
        for (int i = 1; i < STUDENT_COUNT; i++) {
            if (score[i] < min) {
                min = score[i];
            }
        }

        // 결과 출력
        System.out.printf("\n===== 통계 결과 =====\n");
        System.out.printf("합계: %d\n", total);
        System.out.printf("평균: %.2f\n", average);
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
        System.out.printf("====================\n");

        keyboard.close();
    }
}