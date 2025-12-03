public class Output {
    static void display(int year, int result) {
        System.out.printf("년도 : %d\n", year);

        if(result == 1) {
            System.out.printf("%d는 윤년입니다.\n", year);
        }
        else {
            System.out.printf("%d는 평년입니다.\n", year);
        }
    }

    static void display() {
        System.out.printf("****************************************\n");
    }
}

