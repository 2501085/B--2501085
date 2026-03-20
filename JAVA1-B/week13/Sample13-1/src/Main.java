//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        String[] name = {"홍길동","이순신","강민성","김지민","이예린"};  //5개
    //    int[] score = new int[name.length]; //5개

        int[] score = Input.inputData(name);
        Comepute (score);
        Output.display(name,score);
    }
}