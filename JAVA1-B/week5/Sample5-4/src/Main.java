//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int a =  5 > 3 ? 6 : 7;  //6
        System.out.printf("a = %d\n", a);
        int b = 2 > 3 ? a++ : a--;  // a= 5, b =6
        System.out.printf("a = %d, b = %d\n", a, b);

        int c = b > a ? ++b -1 : a++ + 1;  //a=5, b = 7, c=6
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);

        c = (b > a) && (a++ > 3) ? ++b -1 : a++ + 1;  //a=6, b = 8, c=7
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
    }
}