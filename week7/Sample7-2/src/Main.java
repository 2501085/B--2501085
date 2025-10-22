import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num;

        System.out.print("정수 입력 : ");
        num = keyboard.nextInt();

        if (num > 6);
            if (num < 12)
                System.out.println("너는 끝이야.");
            else
                System.out.println("미안해, 너는 기회를 상실했어");
    }
}