//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        // 문제 1
        System.out.println("문제 1:");
        int a, b;
        a = 3; b = 4;
        System.out.printf("a = %d, b = %d", ++a, b++);
        System.out.printf("\na = %d, b = %d\n", a, b);

        // 문제 2
        System.out.println("\n문제 2:");
        a = 3; b = 4;
        System.out.printf("a = %d, b = %d", --a, b--);
        System.out.printf("\na = %d, b = %d\n", a, b);

    }
}