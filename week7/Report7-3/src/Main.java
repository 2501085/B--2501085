import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // 입력
        System.out.printf("국어, 영어, 수학 점수는 ? ");
        int korean = keyboard.nextInt();
        int english = keyboard.nextInt();
        int math = keyboard.nextInt();

        // 평균 계산
        double average = (korean + english + math) / 3.0;

        // 학점 결정
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // 결과 판정
        String result;
        if (average >= 80) {
            result = "성적양호";
        } else if (average >= 60) {
            result = "노력";
        } else {
            result = "성적불량";
        }

        // 출력
        System.out.printf("===============================\n");
        System.out.printf("국어  영어  수학  평균   학점  결  과\n");
        System.out.printf(" %d   %d   %d  %.2f  %s  %s\n",
                korean, english, math, average, grade, result);
        System.out.printf("===============================\n");

        keyboard.close();
    }
}