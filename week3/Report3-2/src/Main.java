import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학교: ");
        String school = sc.nextLine();
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별: ");
        char gender = sc.nextLine().charAt(0);
        System.out.print("신장: ");
        double height = sc.nextDouble();
        System.out.print("체중: ");
        double weight = sc.nextDouble();

        System.out.println("*********************");
        System.out.println("학교: " + school);
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);
        System.out.println("신장: " + height + " cm");
        System.out.println("체중: " + weight + " kg");
        System.out.println("*********************");
    }
}