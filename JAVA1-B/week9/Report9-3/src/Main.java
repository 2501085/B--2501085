//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        // 상수 정의
        final int WELL_DEPTH = 300;      // 우물 깊이 (3m = 300cm)
        final int CLIMB_DAY = 55;        // 낮에 올라가는 거리 (cm)
        final int SLIDE_NIGHT = 13;      // 밤에 미끄러지는 거리 (cm)
        final int TIME_LIMIT = 7;        // 제한 시간 (일)

        int currentPosition = 0;         // 현재 위치
        int day = 0;                     // 경과 일수
        boolean escaped = false;         // 탈출 성공 여부

        System.out.printf("===== 달팽이 우물 탈출 =====\n");
        System.out.printf("우물 깊이: %dcm\n", WELL_DEPTH);
        System.out.printf("낮에 올라가는 거리: %dcm\n", CLIMB_DAY);
        System.out.printf("밤에 미끄러지는 거리: %dcm\n", SLIDE_NIGHT);
        System.out.printf("제한 시간: %d일\n\n", TIME_LIMIT);

        // 반복문으로 매일의 상황 시뮬레이션
        while (day < TIME_LIMIT && !escaped) {
            day++;  // 날짜 증가

            // 낮에 올라감
            currentPosition += CLIMB_DAY;
            System.out.printf("%d일째 낮: %dcm 올라감 → 현재 위치: %dcm\n",
                    day, CLIMB_DAY, currentPosition);

            // 우물을 탈출했는지 확인
            if (currentPosition >= WELL_DEPTH) {
                escaped = true;
                System.out.printf("      우물 탈출 성공!\n");
                break;
            }

            // 밤에 미끄러짐
            currentPosition -= SLIDE_NIGHT;
            System.out.printf("%d일째 밤: %dcm 미끄러짐 → 현재 위치: %dcm\n\n",
                    day, SLIDE_NIGHT, currentPosition);
        }

        // 최종 결과 출력
        System.out.printf("\n===== 결과 =====\n");
        if (escaped) {
            System.out.printf("달팽이는 %d일 만에 우물을 탈출했습니다!\n", day);
            System.out.printf("방울꽃이 시들기 전에 곁을 지킬 수 있습니다! \n");
        } else {
            System.out.printf("달팽이는 %d일 안에 탈출하지 못했습니다.\n", TIME_LIMIT);
            System.out.printf("방울꽃이 시들어버렸습니다... \n");
        }
        System.out.printf("=================\n");
    }
}