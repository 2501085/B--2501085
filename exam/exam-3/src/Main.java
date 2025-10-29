import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // 입력
        System.out.printf("시간 입력: ");
        double time = keyboard.nextDouble();

        // 시간을 초로 변환
        int totalSeconds = (int)(time * 3600);

        // 일 계산
        int days = totalSeconds / 86400;
        int remainingSeconds = totalSeconds % 86400;

        // 시간 계산
        int hours = remainingSeconds / 3600;
        remainingSeconds = remainingSeconds % 3600;

        // 분 계산
        int minutes = remainingSeconds / 60;

        // 초 계산
        int seconds = remainingSeconds % 60;

        // 출력
        System.out.printf("\n%.2f 시간은 %d 일 %d 시간 %d 분 %d 초 입니다\n",
                time, days, hours, minutes, seconds);

        keyboard.close();
    }
}