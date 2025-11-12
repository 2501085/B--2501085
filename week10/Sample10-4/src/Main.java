import java.util.Random;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        final int LENGTH = 6;
        int[] lotto = new int[LENGTH];

        int i = 0;
        boolean flag = false;
        while (i <lotto.length){
            lotto[i] = random.nextInt(45) +1;
            for (int j = 0; j <= i; j++) {
                if (lotto[i] == lotto[j]) {
                    System.err.println("중복 발생");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                i++;
            }else {
                flag = false;
            }
        }

        System.out.print("LOTTO : ");
        for (i = 0; i < lotto.length; i++)
            System.out.printf("%2d, ", lotto[i]);
        System.out.printf("\b\b");
    }
}