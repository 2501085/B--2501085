//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = -a;
        int c = (((a++) +2) - (--b));
        // b = b - 1;  -6
        // c = a + 2 - b; 13
        // a = a + 1; 6
        int d = (((a--) + (++b)) + 2);
        // b = b + 1;    -5
        // d = a + b + 2;  3
        // a = a - 1;    5

        float e = 5.0f / 4.0f;

        a + = 4;  // a = a + 4;

        System.out.printf("a = %d, b = %d, c = %d, d = %d e =%.2f\n",
                a, b, c, d, e);

    }
}