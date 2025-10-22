import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int score;
        char grade;
        char plus = 'D';

        System.out.print("점수 입력(0~100) : ");
        score = keyboard.nextInt();

        if (score >=0 && score <= 100){
            int temp = score / 10;
            switch (temp){
                case 10 :
                    grade = 'A';
                    plus = '+';
                    break;
                case 9 :
                    grade = 'A';
                    break;
                case 8 :
                    grade = 'B';
                    break;
                case 7 :
                    grade = 'C';
                    break;
                case 6 :
                    grade = 'D';
                    break;
                case 5 :
                    grade = 'F';
                    plus = ' ';
                default:

            }
            if (temp == 9 || grade == 'B' || grade =='C' || grade =='D') {
                int temp1 = score % 10;
                switch (temp1) {
                    case 9:
                    case 8:
                    case 7:
                    case 6:
                    case 5:
                        plus = '+';
                        break;
                    default:
                        plus = ' ';
                }
            }





            System.out.printf("점수가 %d이면 학점은 %c%c 입니다.\n",score, grade,plus);
        }else {
            System.err.println("ERROR : 점수는 0 ~ 100점 입니다.");
        }





    }
}