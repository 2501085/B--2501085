import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        final int COUNT = 10;
        int num;
        int sum = 0;

        int count = 0;
        for (   ; count <= COUNT;   ) {
            System.out.printf("%d회 양의 정수 입력 : ", count);
            num = keyboard.nextInt();
            if (num < 0){
                System.err.println("ERROR: 양의 정수 입력");
                System.in.read();
            }else {
               // System.out.printf("%d + ",num);
                sum +=num;
                count++;
            }
        }

        System.out.printf("합계 = %,d\n",sum );
        System.out.printf("평균 : %.2f\n", sum/ (float) COUNT);

    }
}