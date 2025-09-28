import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 부가가치세 계산 ===");
        System.out.print("판매금액을 입력하세요: ");
        int totalAmount = scanner.nextInt();

        // 부가가치세는 총 금액의 10/110 (총액에서 세금 분리)
        // 금액 = 총액 / 1.1
        // 세금 = 총액 - 금액
        int baseAmount = (int)(totalAmount / 1.1);
        int tax = totalAmount - baseAmount;

        System.out.printf("판매금액: %,d원\n", totalAmount);
        System.out.printf("금액: %,d원\n", baseAmount);
        System.out.printf("세금: %,d원\n", tax);

        scanner.close();
    }
}