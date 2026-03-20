import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num;
        String result;

        System.out.print("정수 입력: ");
        num = keyboard.nextInt();

        result = (num % 2 == 0) ? "짝수" : "홀수"; //조건연산자
        System.out.printf("%d는 %s 입니다. \n", num, result);

        if (num % 2 == 0){
            result = "짝수";
        }if (num % 2 == 1){
            result = "홀수";
        }
        System.out.printf("%d는 %s 입니다. \n", num, result);


        switch (num % 2) {
            case 0 : result = "짝수";
            break;
            default //case 1
                    : result = "홀수";
        }
        System.out.printf("%d는 %s 입니다. \n", num, result);
    }
}