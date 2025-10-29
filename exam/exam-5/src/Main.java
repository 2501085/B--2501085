import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 상수 정의
        final double PI = 3.141592;

        // 입력
        System.out.printf("구의 반지름 입력: ");
        int radius = keyboard.nextInt();

        // 계산
        // 구의 부피 = 4/3 * π * r³
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);

        // 구의 표면적 = 4 * π * r²
        double surfaceArea = 4 * PI * Math.pow(radius, 2);

        // 출력
        System.out.printf("\n===== 구의 부피와 표면적 계산 =====\n");
        System.out.printf("반지름(r): %d\n", radius);
        System.out.printf("구의 부피: %.2f\n", volume);
        System.out.printf("구의 표면적: %.2f\n", surfaceArea);

        keyboard.close();
    }
}