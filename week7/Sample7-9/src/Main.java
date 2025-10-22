import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int salary;
        int tax;

        System.out.print("임금 입력 (1 ~ 30000000) : ");
        salary = keyboard.nextInt();

        if (salary >= 1 && salary <= 30000000){
            if (salary < 200000){
                tax = 0;
            }else if (salary <= 4000000){
                tax = (int)((salary - 2000000) * 10.0 / 100);
            }else if (salary <= 6000000){
                tax = (int)((salary - 2000000) * 8.0 / 100);
            }else if (salary <= 20000000){
                tax = (int)((salary - 2000000) * 6.0 / 100);
            }else {
                tax = (int)((salary - 2000000) * 5.0 / 100);
            }


            System.out.printf("급여액인 %,d원의 세금은 %,d 원 입니다.\n", salary, tax);
        }else {
            System.err.println("ERROR : 급여를 정확하게 입력하세요.");
        }




    }
}