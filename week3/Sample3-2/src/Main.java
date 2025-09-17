//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        short test1 = 127;
        short test2 = 45;

        short result = (short) (test1 + test2);
        result = 3.0 + 3.5;

        System.out.printf("%d + %d = %d \n", test1, test2, result);
    }
}