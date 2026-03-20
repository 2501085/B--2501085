import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        String[][] students = new String[][] {
                {"12345","홍길동"},{"34563","이혜인"},
                {"45321","김명성"},{"56456","경복대"}, {"67853","이대학"}};
        String[] subject = new String[] {"국어","영어","수학"};

        int[][] score = new int[students.length][subject.length + 1]; // 4 = 국어,영어,수학,총점
        float[] avg = new float[students.length];
        boolean swapped;  // 정렬용 플래그 추가

        // 성적 입력
        for (int i = 0; i < students.length; i++) {
            int j = 0;
            while (j < subject.length) {
                System.out.printf("%s님의 %s 성적 입력 : ", students[i][1], subject[j]);
                score[i][j] = keyboard.nextInt();

                if (score[i][j] >= 0 && score[i][j] <= 100) {
                    j++;
                } else {
                    System.err.println("ERROR : 0 ~ 100");
                    System.in.read();
                }
            }
        }

        // 총점 계산
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < subject.length; j++) {
                score[i][score[i].length - 1] += score[i][j];
            }
        }

        // 평균 계산
        for (int i = 0; i < students.length; i++) {
            avg[i] = score[i][score[i].length - 1] / (float) subject.length;
        }

        // 평균 기준 내림차순 정렬 (버블 정렬)
        for (int i = 0; i < students.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (avg[j] < avg[j + 1]) {
                    // avg 교환
                    float tempAvg = avg[j];
                    avg[j] = avg[j + 1];
                    avg[j + 1] = tempAvg;

                    // students 교환 (학번, 이름)
                    String[] tempStudent = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tempStudent;

                    // score 교환 (국어, 영어, 수학, 총점)
                    int[] tempScore = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = tempScore;

                    swapped = true;
                }
            }
            // 교환이 없으면 정렬 완료
            if (!swapped) break;
        }

        // 정렬된 성적표 출력
        System.out.println("\n*********************************************");
        System.out.println(" 학번  이름  국어  영어  수학  총점  평균");
        System.out.println("*********************************************");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%6s %3s %3d %3d %3d %3d %6.2f\n",
                    students[i][0], students[i][1],
                    score[i][0], score[i][1], score[i][2], score[i][3], avg[i]);
        }
        System.out.println("*********************************************");

        keyboard.close();
    }
}