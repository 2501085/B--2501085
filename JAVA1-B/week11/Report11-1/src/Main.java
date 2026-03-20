import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 상수 정의
        final int BASE_FEE = 1200;          // 기본료
        final int CUSTOMER_COUNT = 10;       // 고객 수

        // 수도 요금표 (1차원 배열 - 인덱스 0은 미사용, 1~5 사용)
        int[] waterRate = {0, 40, 55, 78, 35, 20};

        // 세율표 (1차원 배열)
        double[] taxRate = {0.0, 0.05, 0.035, 0.025, 0.015, 0.0};

        // 수도 구분 명칭 배열
        String[] categoryName = {"", "가정용", "영업용", "공장용", "관공서", "군기관"};

        // 데이터 저장 배열
        String[] customerId = new String[CUSTOMER_COUNT];
        String[] name = new String[CUSTOMER_COUNT];
        int[] category = new int[CUSTOMER_COUNT];
        double[] usage = new double[CUSTOMER_COUNT];
        int[] roundedUsage = new int[CUSTOMER_COUNT];
        int[] usageFee = new int[CUSTOMER_COUNT];
        int[] tax = new int[CUSTOMER_COUNT];
        int[] totalFee = new int[CUSTOMER_COUNT];

        // 데이터 입력
        System.out.printf("===== 수도 요금 계산 시스템 =====\n\n");

        for (int i = 0; i < CUSTOMER_COUNT; i++) {
            System.out.printf("[%d번 고객 정보 입력]\n", i + 1);

            System.out.printf("수용가 번호 (4자리): ");
            customerId[i] = keyboard.next();

            System.out.printf("이름: ");
            name[i] = keyboard.next();

            System.out.printf("수도 구분 코드 (1:가정용 2:영업용 3:공장용 4:관공서 5:군기관): ");
            category[i] = keyboard.nextInt();

            System.out.printf("사용량 (m³): ");
            usage[i] = keyboard.nextDouble();

            // 사용량 반올림 (사사오입)
            roundedUsage[i] = (int)Math.round(usage[i]);

            // 사용금액 계산
            usageFee[i] = roundedUsage[i] * waterRate[category[i]];

            // 세금 계산 (1의 자리 절사)
            double tempTax = (BASE_FEE + usageFee[i]) * taxRate[category[i]];
            tax[i] = (int)(tempTax / 10) * 10;  // 1의 자리 절사

            // 납부금액 계산
            totalFee[i] = BASE_FEE + usageFee[i] + tax[i];

            System.out.printf("\n");
        }

        // 결과 출력
        System.out.printf("\n");
        System.out.printf("                    수    도    요    금\n");
        System.out.printf("----------------------------------------------------------------------\n");
        System.out.printf("번호\t이름\t구분\t\t사용량\t사용금액\tTAX\t납부액\t비고\n");
        System.out.printf("----------------------------------------------------------------------\n");

        for (int i = 0; i < CUSTOMER_COUNT; i++) {
            System.out.printf("%s\t%s\t%s\t\t%.1f\t%,d\t\t%,d\t%,d",
                    customerId[i],
                    name[i],
                    categoryName[category[i]],
                    usage[i],
                    usageFee[i],
                    tax[i],
                    totalFee[i]);

            // 군기관이면 "일괄징수" 표시
            if (category[i] == 5) {
                System.out.printf("\t일괄징수");
            }

            System.out.printf("\n");
        }

        System.out.printf("----------------------------------------------------------------------\n");
    }
}