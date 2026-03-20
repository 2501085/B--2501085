import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int won = 0;         // data
        float convert;       // Data
        float dollar = 0.0f;   // 정보

        System.out.print("오늘의 dollor 환율은? ");
        convert = keyboard.nextFloat();
        System.out.print("원화 얼마를 dollor로 환전할까? ");
        won = keyboard.nextInt();

        dollar = won / convert;

        System.out.printf("원화 %,d원은 %,f 달러($)입니다.\n", won, dollar);
    }
}