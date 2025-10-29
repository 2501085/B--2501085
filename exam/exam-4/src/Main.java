import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 상수 정의
        final double PROFIT_RATE = 0.30;  // 30%
        final double TAX_RATE = 0.10;     // 10%

        // 입력
        System.out.printf("매입원가 입력: ");
        int purchasePrice = keyboard.nextInt();

        // 계산
        // 1. 정가 = 매입원가 * (1 + 이익율)
        int sellingPrice = (int)(purchasePrice * (1 + PROFIT_RATE));

        // 2. 매출세액 = 매출액 * 세율 (10%)
        int salesTax = (int)(sellingPrice * TAX_RATE);

        // 3. 매입세액 = 매입액 * 세율 (10%)
        int purchaseTax = (int)(purchasePrice * TAX_RATE);

        // 4. 납부세액 = 매출세액 - 매입세액
        int payableTax = salesTax - purchaseTax;

        // 출력
        System.out.printf("\n===== 부가세 계산 결과 =====\n");
        System.out.printf("매입원가: %,d원\n", purchasePrice);
        System.out.printf("이익율: %.0f%%\n", PROFIT_RATE * 100);
        System.out.printf("정가: %,d원\n", sellingPrice);
        System.out.printf("매출세액: %,d원\n", salesTax);
        System.out.printf("매입세액: %,d원\n", purchaseTax);
        System.out.printf("납부세액: %,d원\n", payableTax);
        System.out.printf("\n>> 세무서에 납부할 세금액: %,d원\n", payableTax);

        keyboard.close();
    }
}