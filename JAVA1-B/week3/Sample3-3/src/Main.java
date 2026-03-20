//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String apple = "부사";
        int count = 4;
        String name = "홍길동";
        double height = 170.5;



        System.out.printf("사과의 종류는 %s이고, 개수는 %d개 입니다. \n", apple,count);
        System.out.printf("%s의 키는 %5.1f %c 입니다.\n", name, height,'\u260e');
    }
}