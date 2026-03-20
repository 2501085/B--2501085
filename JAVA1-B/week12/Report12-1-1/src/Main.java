//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int num1, num2, num3, num4;
        int result;

        Output.display();
        num1 = Input.readData("1번째 데이터 : ");
        num2 = Input.readData("2번째 데이터 : ");
        num3 = Input.readData("3번째 데이터 : ");
        num4 = Input.readData("4번째 데이터 : ");
        result = Compose.max4(num1, num2, num3, num4);
        Output.display(num1, num2, num3, num4, result);
        Output.display();
    }
}