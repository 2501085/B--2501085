import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PRICE_PER_PYEONG = 56000; // 1평 단가

        System.out.println("=== 신도시 주택지 가격 계산 ===");
        System.out.print("주택 평수를 입력하세요: ");
        double pyeong = scanner.nextDouble();

        // 총 가격 계산
        double totalPrice = pyeong * PRICE_PER_PYEONG;

        // 1,000원 미만 버림
        int finalPrice = (int)(totalPrice / 1000) * 1000;

        System.out.printf("평수: %.2f평\n", pyeong);
        System.out.printf("1평 단가: %,d원\n", PRICE_PER_PYEONG);
        System.out.printf("계산된 가격: %,.0f원\n", totalPrice);
        System.out.printf("최종 가격 (1,000원 미만 버림): %,d원\n", finalPrice);

        scanner.close();
    }
}