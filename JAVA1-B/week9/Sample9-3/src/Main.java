//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        for (int j = 1; j <=3; j++){
            System.out.printf("Set : %d\n", j);
            int i = 1;
            do {
                System.out.printf("팔굽혀펴기: %2d 회\n", i);
            } while (i <= 20);

         /*   while (i <=20){
                System.out.printf("팔굽혀펴기: %2d 회\n", i);
            } */
           /* for (int i = 1; i <= 20; i++) {
                System.out.printf("팔굽혀펴기: %2d 회\n", i);
            } */
        }

    }
}