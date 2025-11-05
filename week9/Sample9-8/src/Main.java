//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        final int TURTLE = (35 * 1000) / (60 * 60); //초당거리
        final int RABIT = (60 * 1000) / (60 * 60);  //초당거리

        int turtle = 450;
        int rabit = 0;

        int i = 1;
        for (   ; true; i++ ){
            turtle +=TURTLE;
            rabit +=RABIT;

            if (rabit > turtle)
                break;
            System.out.printf("%d초 후 토끼 : %,d m, 거북이는 : %,d m\n", i,turtle,rabit);
        }
        System.out.printf("%d초 후 토끼 : %,d m, 거북이는 : %,d m\n", i,turtle,rabit);
    }
}