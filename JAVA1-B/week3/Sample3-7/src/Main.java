//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final long SPEED = 300000;
        float year = 365.25f;
        double light = 0.0;


        light = (((year * 24) * 60) * 60) * SPEED;



        System.out.printf("빛이 1초에 가는 거리 : %,d Km\n", SPEED);
        System.out.printf("1년 : %6.2f\n", year);
        System.out.printf("1광년 : %,.2f Km\n", light);
    }
}