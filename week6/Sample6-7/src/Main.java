import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        final int GOLD = 849000;
        float weight;
        float don;
        long result;

        System.out.print("당신의 체중은? ");
        weight = keyboard.nextFloat();

        don = weight * 1000 / 3.75f;
        result = (long) (don * GOLD);

        System.out.printf("금 1돈(3.75g)의 가격은 %,d 원 입니다. \n", GOLD);
        System.out.printf("나의 체중은 %.1f kg(%,.1f 돈) 입니다. \n", weight, don);
        System.out.printf("나의 몸값은 %,d 원 입니다.\n", result);
    }
}