import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // 입력
        System.out.print("주유할 리터 수 입력: ");
        double liters = keyboard.nextDouble();

        System.out.print("리터당 가격 입력: ");
        int pricePerLiter = keyboard.nextInt();

        // 기본 금액 계산
        int basicAmount = (int)(liters * pricePerLiter);

        // 할인 적용 여부 판단
        int discountAmount = 0;
        if (basicAmount >= 50000) {
            discountAmount = (int)(basicAmount * 0.07);
        }

        // 할인 후 금액 계산
        int afterDiscount = basicAmount - discountAmount;

        // 부가세 계산 (10%)
        int tax = (int)(afterDiscount * 0.10);

        // 최종 결제 금액 계산
        int finalAmount = afterDiscount + tax;

        // 출력
        System.out.println("\n===== 주유 금액 계산 =====");
        System.out.println("주유량: " + liters + "L");
        System.out.println("리터당 가격: " + pricePerLiter + "원");
        System.out.println("기본 금액: " + basicAmount + "원");
        System.out.println("할인 금액: " + discountAmount + "원 (7%)");
        System.out.println("할인 후 금액: " + afterDiscount + "원");
        System.out.println("부가세: " + tax + "원 (10%)");
        System.out.println("최종 결제 금액: " + finalAmount + "원");

    }
}