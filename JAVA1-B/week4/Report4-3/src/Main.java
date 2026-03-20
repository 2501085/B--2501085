import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 미국 화폐 총액 계산 ===");
        System.out.println("미국 화폐 개수를 입력하세요:");

        System.out.print("달러(Dollar) 개수: ");
        int dollars = scanner.nextInt();

        System.out.print("하프(Half) 개수: ");
        int halfs = scanner.nextInt();

        System.out.print("쿼터(Quarter) 개수: ");
        int quarters = scanner.nextInt();

        System.out.print("다임(Dime) 개수: ");
        int dimes = scanner.nextInt();

        System.out.print("니켈(Nickel) 개수: ");
        int nickels = scanner.nextInt();

        System.out.print("페니(Penny) 개수: ");
        int pennies = scanner.nextInt();

        // 각 화폐의 센트 값
        final int DOLLAR_CENT = 100;
        final int HALF_CENT = 50;
        final int QUARTER_CENT = 25;
        final int DIME_CENT = 10;
        final int NICKEL_CENT = 5;
        final int PENNY_CENT = 1;

        // 총 센트 계산
        int totalCents = dollars * DOLLAR_CENT +
                halfs * HALF_CENT +
                quarters * QUARTER_CENT +
                dimes * DIME_CENT +
                nickels * NICKEL_CENT +
                pennies * PENNY_CENT;

        // 달러와 센트로 변환
        int totalDollars = totalCents / 100;
        int remainingCents = totalCents % 100;

        System.out.println("\n=== 계산 결과 ===");
        System.out.printf("입력된 화폐:\n");
        System.out.printf("- 달러: %d개 (%d cents)\n", dollars, dollars * DOLLAR_CENT);
        System.out.printf("- 하프: %d개 (%d cents)\n", halfs, halfs * HALF_CENT);
        System.out.printf("- 쿼터: %d개 (%d cents)\n", quarters, quarters * QUARTER_CENT);
        System.out.printf("- 다임: %d개 (%d cents)\n", dimes, dimes * DIME_CENT);
        System.out.printf("- 니켈: %d개 (%d cents)\n", nickels, nickels * NICKEL_CENT);
        System.out.printf("- 페니: %d개 (%d cents)\n", pennies, pennies * PENNY_CENT);

        System.out.printf("\n총 센트: %d cents\n", totalCents);
        System.out.printf("총 금액: %d달러 %d센트\n", totalDollars, remainingCents);
        System.out.printf("총 금액: $%.2f\n", totalCents / 100.0);

        scanner.close();
    }
}