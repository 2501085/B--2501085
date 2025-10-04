import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 JAVA 점수 입력: ");
        int score = sc.nextInt();

        String grade;

        if (score >= 60) {
            char gradeChar = (char)('A' + (100 - score) / 10);
            String plusMinus = (score % 10 >= 5) ? "+" : "0";

            if (score >= 95) {
                grade = "A+";
            } else if (score < 65 && score >= 60) {
                grade = "D0";
            } else {
                grade = gradeChar + plusMinus;
            }
        } else {
            grade = "F";
        }

        System.out.println("입력 점수: " + score);
        System.out.println("학점: " + grade);

        sc.close();
    }
}