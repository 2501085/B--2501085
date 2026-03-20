//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        boolean test = (0 ==-0);
        boolean test1 = 4 < 1;
        boolean test2 = 'a' > 'A';  //97 > 65;
        boolean test3 = ('a' + 2) != 'b'; //true
        boolean test4 = true != false; //true
        boolean test5 = ((!true) != false); //false

        System.out.printf("test = %b\n", test); //true
        System.out.printf("test1 = %b\n", test1);  //false
        System.out.printf("test2 = %b\n", test2);  //true
        System.out.printf("test3 = %b\n", test3);  //true
        System.out.printf("test4 = %b\n", test4);  //true
        System.out.printf("test5 = %b\n", test5);  //false
    }
}