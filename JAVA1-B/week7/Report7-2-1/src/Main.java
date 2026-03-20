import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // 입력
        System.out.printf("현재 온도를 입력하세요: ");
        int temp = keyboard.nextInt();

        // 온도에 따른 경보 판단
        String alert;

        if (temp >= 35) {
            alert = "폭염 경보";
        } else if (temp >= 30) {
            alert = "폭염 주의보";
        } else if (temp >= -10) {
            alert = "정상 온도";
        } else {
            alert = "한파 경보";
        }

        // 출력
        System.out.printf("현재 온도: %d도\n", temp);
        System.out.printf("상태: %s\n", alert);

        keyboard.close();
    }
}