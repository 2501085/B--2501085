public class Output {
    static void display(long money, String hangul) {
        System.out.printf("금액 입력 : %d\n", money);
        System.out.printf("%d는 %s\n", money, hangul);
    }

    static void display() {
        System.out.printf("****************************************\n");
    }
}
