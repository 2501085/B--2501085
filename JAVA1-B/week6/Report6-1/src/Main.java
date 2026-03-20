import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // 입력
        System.out.print("식권 개수 입력: ");
        int count = keyboard.nextInt();

        System.out.print("식권 단가 입력: ");
        int price = keyboard.nextInt();

        // 원래 금액 계산
        int originalAmount = count * price;

        // 할인율 결정 (큰 조건부터 검사)
        double discountRate;
        if (count >= 30) {
            discountRate = 0.20;
        } else if (count >= 20) {
            discountRate = 0.15;
        } else if (count >= 10) {
            discountRate = 0.10;
        } else {
            discountRate = 0.0;
        }

        // 할인 금액 및 최종 금액 계산
        int discountAmount = (int)(originalAmount * discountRate);
        int finalAmount = originalAmount - discountAmount;

        // 출력
        System.out.println("\n===== 식권 구매 내역 =====");
        System.out.println("구매 개수: " + count + "장");
        System.out.println("식권 단가: " + price + "원");
        System.out.println("원래 금액: " + originalAmount + "원");
        System.out.println("할인율: " + (int)(discountRate * 100) + "%");
        System.out.println("할인 금액: " + discountAmount + "원");
        System.out.println("최종 결제 금액: " + finalAmount + "원");

    }
}