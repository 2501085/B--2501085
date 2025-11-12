import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 변수 선언
        int[] votes = new int[5];  // votes[1]~votes[4] 사용 (0번은 미사용)
        int invalidVotes = 0;      // 무효표
        int totalVotes = 0;        // 총 투표수
        int vote;                  // 입력받을 투표 번호

        // 안내 메시지
        System.out.printf("===== 반대표 투표 시스템 =====\n");
        System.out.printf("후보: 1번, 2번, 3번, 4번\n");
        System.out.printf("투표 종료: 0 입력\n");
        System.out.printf("============================\n\n");

        // 투표 진행
        while (true) {
            System.out.printf("1~4번 중 한 후보의 번호를 입력 (종료:0): ");
            vote = keyboard.nextInt();

            // 0이면 투표 종료
            if (vote == 0) {
                break;
            }

            // 총 투표수 증가
            totalVotes++;

            // 유효표 검사
            if (vote >= 1 && vote <= 4) {
                votes[vote]++;  // 해당 후보 득표수 증가
            } else {
                invalidVotes++;  // 무효표 증가
            }
        }

        // 결과 출력
        System.out.printf("\n===== 득표 결과 =====\n");
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%d번 후보: %d표\n", i, votes[i]);
        }
        System.out.printf("무효표: %d표\n", invalidVotes);
        System.out.printf("총 투표수: %d표\n", totalVotes);
        System.out.printf("====================\n");
        keyboard.close();
    }
}