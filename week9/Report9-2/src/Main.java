//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        // 상수 정의
        final int COIN_500_COUNT = 10;      // 500원 동전 개수
        final int COIN_100_COUNT = 10;      // 100원 동전 개수
        final int MONTHS_PER_YEAR = 12;     // 1년 = 12개월
        final int YEARS = 30;                // 저금 기간 30년

        // 한 달 저금액 계산
        int monthlyAmount = (500 * COIN_500_COUNT) + (100 * COIN_100_COUNT);

        // 총 저금액 초기화
        int totalAmount = 0;

        System.out.printf("===== 돼지 저금통 계산 =====\n");
        System.out.printf("한 달에 500원짜리 %d개\n", COIN_500_COUNT);
        System.out.printf("한 달에 100원짜리 %d개\n", COIN_100_COUNT);
        System.out.printf("한 달 저금액: %,d원\n\n", monthlyAmount);

        // 반복문으로 30년 동안의 저금액 계산
        for (int year = 1; year <= YEARS; year++) {
            for (int month = 1; month <= MONTHS_PER_YEAR; month++) {
                totalAmount += monthlyAmount;
            }

            // 매 10년마다 중간 결과 출력
            if (year % 10 == 0) {
                System.out.printf("%d년 후 저금액: %,d원\n", year, totalAmount);
            }
        }

        // 최종 결과 출력
        System.out.printf("\n===== 최종 결과 =====\n");
        System.out.printf("%d년 동안 저금한 총 금액: %,d원\n", YEARS, totalAmount);
        System.out.printf("=======================\n");
    }
}