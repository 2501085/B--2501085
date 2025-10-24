import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 입력
        System.out.printf("3개의 정수 : ");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();

        int max, mid, min;

        // 선택문을 사용한 크기 비교
        if (a >= b && a >= c) {
            // a가 최댓값
            max = a;
            if (b >= c) {
                mid = b;
                min = c;
            } else {
                mid = c;
                min = b;
            }
        } else if (b >= a && b >= c) {
            // b가 최댓값
            max = b;
            if (a >= c) {
                mid = a;
                min = c;
            } else {
                mid = c;
                min = a;
            }
        } else {
            // c가 최댓값
            max = c;
            if (a >= b) {
                mid = a;
                min = b;
            } else {
                mid = b;
                min = a;
            }
        }

        // 출력
        System.out.printf("입력 받은 %d, %d, %d를 크기 순으로 나열하면 %d, %d, %d 입니다\n",
                a, b, c, min, mid, max);

        keyboard.close();
    }
}