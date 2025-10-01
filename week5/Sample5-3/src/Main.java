//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        boolean test = ((('a' + 1) > 'A') && ('A' > 'B'));  //'b' > 'A' -> true &&(*) false -> false
        boolean test1 = ((('a' + 1) > 'A') || ('A' > 'B'));  //'b' > 'A' -> true ||(+) ? -> true

        int a = 5;

        boolean test2 = ((5 > 3) && ((a++) !=0));   //true && true - true a = 6


        System.out.printf("test = %b\n", test);
        System.out.printf("test1 = %b\n", test1);
        System.out.printf("test2 = %b, a = %d\n", test2,a);


        boolean test3 = ((2 > 3) & ((++a) !=0));   //false * true - false a = 7
        System.out.printf("test3 = %b, a = %d\n", test3,a);
    }
}