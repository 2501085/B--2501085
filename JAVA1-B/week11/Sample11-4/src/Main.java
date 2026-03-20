import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        String[][] employees = {{"홍길동","1111"},{"강민성","1211"},{"김명성","2111"},
                {"박건준","1441"},{"오유빈","1444"}, {"니키타","1456"},
                {"한정호","1678"},{"파마트","1567"}, {"이예린","1789"},
                {"제이넵","1789"}};

        int[] hobong = {1, 4, 5, 4, 3, 1, 3, 4, 3, 2};
        int[][] salary = new int[employees.length][5];  // {기본금, 업무수당,급여액,지금액,세금, 지급액}
        boolean swapped;  // 버블 정렬용 플래그

        // 업무수당 입력
        int i = 0;
        while (i < employees.length) {
            System.out.printf("%s님의 업무수당 입력 : ", employees[i][0]);
            salary[i][1] = keyboard.nextInt();

            if (salary[i][1] >= 0 && salary[i][1] <= 1000000) {
                i++;
            } else {
                System.err.println("ERROR : 업무 수당은 0 ~ 1,000,000");
                System.in.read();
            }
        }

        // 호봉별 기본급 설정
        for (i = 0; i < employees.length; i++) {
            switch (hobong[i]) {
                case 1:
                    salary[i][0] = 1650000;
                    break;
                case 2:
                    salary[i][0] = 1680000;
                    break;
                case 3:
                    salary[i][0] = 1700000;
                    break;
                case 4:
                    salary[i][0] = 1720000;
                    break;
                case 5:
                    salary[i][0] = 1750000;
                    break;
                default:
                    salary[i][0] = 0;
            }
        }

        // 급여액 계산 (기본급 + 업무수당)
        for (i = 0; i < employees.length; i++) {
            salary[i][2] = salary[i][0] + salary[i][1];
        }

        // 세금 계산
        for (i = 0; i < employees.length; i++) {
            if (salary[i][2] >= 2600000) {
                salary[i][3] = (int)(salary[i][2] * (10.0f / 100));
            } else if (salary[i][2] > 2000000) {
                salary[i][3] = (int)(salary[i][2] * (8.0f / 100));
            } else {
                salary[i][3] = (int)(salary[i][2] * (5.0f / 100));
            }
        }

        // 지급액 계산 (급여액 - 세금)
        for (i = 0; i < employees.length; i++) {
            salary[i][4] = salary[i][2] - salary[i][3];
        }

        // 지급액 기준 내림차순 정렬 (버블 정렬)
        for (i = 0; i < employees.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (salary[j][4] < salary[j + 1][4]) {  // 지급액 기준 내림차순
                    // salary 교환
                    int[] tempSalary = salary[j];
                    salary[j] = salary[j + 1];
                    salary[j + 1] = tempSalary;

                    // employees 교환
                    String[] tempEmployee = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = tempEmployee;

                    // hobong 교환
                    int tempHobong = hobong[j];
                    hobong[j] = hobong[j + 1];
                    hobong[j + 1] = tempHobong;

                    swapped = true;
                }
            }
            if (!swapped) break;  // 교환이 없으면 정렬 완료
        }

        // 정렬된 급여표 출력
        System.out.println("\n*****************************************************************************");
        System.out.println("이름  사번  호봉  기본급  업무수당  급여액  세금  지급액");
        System.out.println("*****************************************************************************");

        for (i = 0; i < employees.length; i++) {
            System.out.printf("%4s %5s %1d %,9d %,9d %,9d %,8d %,9d\n",
                    employees[i][0], employees[i][1], hobong[i],
                    salary[i][0], salary[i][1], salary[i][2], salary[i][3], salary[i][4]);
        }
        System.out.println("*****************************************************************************");

        keyboard.close();
    }
}