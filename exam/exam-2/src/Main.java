import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.printf("나이를 입력하세요: ");
        int age = keyboard.nextInt();

        int fee = (age >= 18) ? 4000 :
                (age >= 13) ? 3000 :
                        (age >= 7) ? 1000 : 0;

        System.out.printf("\n===== 체육관 입장료 계산 =====\n");
        System.out.printf("나이: %d세\n", age);
        System.out.printf("입장료: %,d원\n", fee);

        keyboard.close();
    }
}