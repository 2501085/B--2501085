//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        boolean test = 5 > 3 && 6 < 3;  //true && false -> false
        boolean test1 = 2 > 3 && 6 < 3;  //false && ? -> false
        boolean test2 = 5 > 3 || 6 < 3;  //true || ? -> true   Short circuit Evaluation(단축연산)
        boolean test3 = 2 > 3 || 6 < 3;  //false || false -> false


        boolean test4 = 5 > 3 & 6 < 3;  //true && false -> false
        boolean test5 = 2 > 3 & 6 < 3;  //false && false -> false

        boolean test6 = 5 > 3 | 6 < 3;  //true || false -> true   Short circuit Evaluation(단축연산)
        boolean test7 = 2 > 3 | 6 < 3;  //false || false -> false


        System.out.printf("test = %b\n", test);
        System.out.printf("test1 = %b\n", test1);
        System.out.printf("test2 = %b\n", test2);
        System.out.printf("test3 = %b\n", test3);
        System.out.printf("test4 = %b\n", test4);
        System.out.printf("test5 = %b\n", test5);
        System.out.printf("test6 = %b\n", test6);
        System.out.printf("test7 = %b\n", test7);
    }
}