import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        //준비물
        Scanner keyboard = new Scanner(System.in);
       String name = "";
       int age = 0;

        //data 입력
        System.out.println("당신의 이름은?");
        name =keyboard.nextLine();
        System.out.printf("%s님의 나이는?",name);
        age =keyboard.nextInt();
        //처리

        //출력(필수)
        System.out.printf("%s님의 나이는 %d살 입니다. \n", name,age);
    }
}