import javax.naming.PartialResultException;
import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        String[] name = {"홍길동", "이재명", "윤석열", "경복대","오세훈"};
        float[] weight = new float[name.length];
        final float MIN = 30.0f;
        final float MAX = 120.0f;
        boolean swapped = false;

        int i = 0;
        while (i < weight.length) {
            System.out.printf("%s님의 몸무게 입력 : ", name[i]);
            weight[i] = keyboard.nextFloat();

            if (weight[i] >= MIN && weight[i] <= MAX)
                i++;
            else {
                System.err.printf("ERROR : %.1f ~ %.1f\n",MIN,MAX);
                System.in.read();
            }
        }

        for (i = 0; i < weight.length - 1; i ++) {
            swapped = false;

            for (int j =0; j <weight.length - 1 -i; j++){
                if (weight[j] >weight[j+1]){
                    float temp = weight [j];
                    weight[j] = weight[j+1];
                    weight[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        for (i = 0; i < name.length; i++) {
            System.out.printf("%s님의 몸무게 %5.1f Kg\n", name[i], weight[i]);
        }
    }
}