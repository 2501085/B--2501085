import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int BASE_PRICE = 10000;

        // 입력
        System.out.printf("연령을 입력하세요: ");
        int age = keyboard.nextInt();

        System.out.printf("관람 시간을 입력하세요 (조조/일반): ");
        String timeType = keyboard.next();

        // 할인율 결정
        int discountRate;

        if (timeType.equals("조조")) {
            discountRate = 20;
        } else {
            // 일반 시간
            if (age >= 65) {
                discountRate = 40;
            } else if (age >= 8 && age <= 18) {
                discountRate = 30;
            } else {
                discountRate = 0;
            }
        }

        // 금액 계산
        int discountAmount = BASE_PRICE * discountRate / 100;
        int finalPrice = BASE_PRICE - discountAmount;

        // 출력
        System.out.printf("\n===== K-영화관 요금 계산 =====\n");
        System.out.printf("연령: %d세\n", age);
        System.out.printf("관람 시간: %s\n", timeType);
        System.out.printf("기본 요금: %d원\n", BASE_PRICE);
        System.out.printf("할인율: %d%%\n", discountRate);
        System.out.printf("할인 금액: %d원\n", discountAmount);
        System.out.printf("최종 요금: %d원\n", finalPrice);

        keyboard.close();

    }
}