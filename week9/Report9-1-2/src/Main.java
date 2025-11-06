//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int totalAnimals = 37;  // 총 동물 수
        int totalLegs = 102;    // 총 다리 수
        int chicken = 0;        // 닭의 수
        int dog;                // 개의 수
        boolean found = false;  // 정답 찾음 여부

        System.out.printf("===== 닭과 개 문제 (do-while문) =====\n");
        System.out.printf("총 동물 수: %d마리\n", totalAnimals);
        System.out.printf("총 다리 수: %d개\n\n", totalLegs);

        // do-while문으로 최소 한 번은 실행
        do {
            dog = totalAnimals - chicken;  // 개의 수 계산

            // 다리 수 확인
            if (chicken * 2 + dog * 4 == totalLegs) {
                System.out.printf("답: 닭 %d마리, 개 %d마리\n", chicken, dog);
                found = true;  // 정답을 찾았으므로 종료
            }

            chicken++;  // 닭의 수 증가

        } while (chicken <= totalAnimals && !found);

        System.out.printf("===================================\n");
    }
}