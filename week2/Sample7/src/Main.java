import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        char ch = ' ';

        System.out.print("문자 하나 입력 : ");
        ch = keyboard.next().charAt(0);


        System.out.printf("입력한 문자 %c의 ASCII 코드는 %d이다. \n", ch, (int)ch);
    }
}