import java.io.IOException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        String[][] customers = new String[][] {{"1111","정서윤","1", ""},{"2222","정서윤","2",""},{"3333","정서윤","3"},
                {"4444","정서윤","4",""},{"5555","정서윤","5",""},{"6666","정서윤","6",""},
                {"7777","정서윤","7",""},{"8888","정서윤","8",""},{"9999","정서윤","9",""},
                {"1010","정서윤","10",""}}; //{번호,이름, 타입, 타입 이름}

        int[][] money = new int[customers.length][3];  //{사용금액,세금,징수금액}

        Input.preProcess(customers);
        float[] used = Input.readData(customers);

        for (int i = 0; i < money.length; i++){
           Compute.pay(money[i], customers[i], used[i]);  //사용 금액 계산
        }


       Compute.tax(customers,money);  //2차원

        for (int i = 0; i < money.length; i++){
          Compute.total(money[i]);
        }

       Output.display(customers,money, used);
    }
}