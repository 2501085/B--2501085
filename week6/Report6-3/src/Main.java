import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // 입력
        System.out.print("나이 입력: ");
        int age = keyboard.nextInt();

        System.out.print("교통카드 사용 (true/false): ");
        boolean useCard = keyboard.nextBoolean();

        System.out.print("탑승 시간 입력 (0~23): ");
        int hour = keyboard.nextInt();

        // 승객 구분 및 기본 요금 결정
        String category;
        int basicFare;

        if (age < 6) {
            category = "유아 (무료)";
            basicFare = 0;
        } else if (age >= 19) {
            category = "성인";
            basicFare = useCard ? 1250 : 1350;
        } else if (age >= 13) {
            category = "청소년";
            basicFare = useCard ? 750 : 850;
        } else {
            category = "어린이";
            basicFare = 450; // 교통카드/현금 동일
        }

        // 결제 방법
        String paymentMethod = useCard ? "교통카드" : "현금";

        // 심야 할증 판단 (22시~05시)
        boolean isLateNight = (hour >= 22 || hour < 6);

        // 최종 요금 계산
        int finalFare = basicFare;
        if (isLateNight && basicFare > 0) {
            finalFare = (int)(basicFare * 1.2);
        }

        // 출력
        System.out.println("\n===== 대중교통 요금 계산 =====");
        System.out.println("나이: " + age + "세");
        System.out.println("승객 구분: " + category);
        System.out.println("결제 방법: " + paymentMethod);
        System.out.println("탑승 시간: " + hour + "시");
        System.out.println("기본 요금: " + basicFare + "원");

        if (isLateNight && basicFare > 0) {
            System.out.println("심야 할증: 적용 (+20%)");
        } else {
            System.out.println("심야 할증: 미적용");
        }

        System.out.println("최종 요금: " + finalFare + "원");

    }
}