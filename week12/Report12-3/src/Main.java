//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        long money;
        String result;

        Output.display();
        money = Input.readData("금액 입력 : ");
        result = Compose.convertHangul(money);
        Output.display(money, result);
        Output.display();
    }
}