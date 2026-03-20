import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("하나의 영문자 입력: ");
        char ch = sc.next().charAt(0);

        // 영문자 여부 확인
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            // 소문자인 경우
            if (ch >= 'a' && ch <= 'z') {
                char convert = (char)(ch - 32);
                System.out.println("입력 문자 " + ch + "는 소문자이고, 대문자로 변경하면 " + convert + " 입니다.");
            }
            // 대문자인 경우
            else {
                char convert = (char)(ch + 32);
                System.out.println("입력 문자 " + ch + "는 대문자이고, 소문자로 변경하면 " + convert + " 입니다.");
            }
        }
        else {
            System.out.println("영문자가 아닙니다.");
        }

        sc.close();
    }
}