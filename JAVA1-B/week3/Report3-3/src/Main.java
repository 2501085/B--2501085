import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("섭씨 온도를 입력하세요 (℃): ");
        double celsius = sc.nextDouble();              // 1장 double

        double fahrenheit = celsius * 9.0 / 5 + 32;     // 3장 산술 연산
        System.out.println("화씨 온도: " + fahrenheit + " ℉");

        sc.close();
    }
}