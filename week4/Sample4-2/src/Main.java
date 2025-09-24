//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        int a = 5;
        int b = 2;

        int c = 5 % 2;  // 1
        int d = -5 % 2; // -1
        int e = -5 % -2; // -1
        int f = 5 % -2;  // 1

        a += (3 + 6);  //<--산술대입연산자 // a = a + (3+6) = 14

        System.out.printf("c = %d, d = %d, e = %d, f = %d\n", c, d, e, f);
    }
}