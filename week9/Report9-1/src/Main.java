//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int totalAnimals = 37;  // 총 동물 수
        int totalLegs = 102;    // 총 다리 수
        int chicken, dog;       // 닭과 개의 수

        System.out.printf("===== 닭과 개 문제 (for문) =====\n");
        System.out.printf("총 동물 수: %d마리\n", totalAnimals);
        System.out.printf("총 다리 수: %d개\n\n", totalLegs);

        // for문으로 닭의 수를 0부터 37까지 반복
        for (chicken = 0; chicken <= totalAnimals; chicken++) {
            dog = totalAnimals - chicken;  // 개의 수 계산

            // 다리 수 확인
            if (chicken * 2 + dog * 4 == totalLegs) {
                System.out.printf("답: 닭 %d마리, 개 %d마리\n", chicken, dog);
                break;  // 정답을 찾았으므로 반복 종료
            }
        }

        System.out.printf("===========================\n");
    }
}