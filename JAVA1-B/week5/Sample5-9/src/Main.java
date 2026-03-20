import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        float height;
        char gender;
        float weight, weight1;
        String result;

        System.out.printf("당신의 키(Meter) 입력 :");
        height = keyboard.nextFloat();
        System.out.print("당신의 성별(남 = M,여 = 'F') 입력 : ");
        gender = keyboard.next().charAt(0);

        weight = gender == 'M' || gender =='m' ? height * height * 22 : height * height;
        weight1 = gender == 'F' || gender =='f' ? height * height * 20 : 0.0f;

        result = gender == 'F' || gender == 'f' ?
                String.format("키가 %.1f m인 여자의 표준체중은 %.2f Kg 입니다.\n",
                        height, weight1) :
                String.format(" ");

        System.out.printf("키가 %.1f m인 %c자의 표준체중은 %.2f Kg 입니다.\n",
                height, gender, weight);

        System.out.printf(gender == 'F' || gender == 'f' ?
                        "키가 %.1f m인 %c자의 표준체중은 %.2f Kg 입니다.\n" : " ",
                height, gender, weight1);

        System.out.printf("키가 %.1f m인 %s자의 미용 체중은 %.2f Kg 입니다.\n",
                height, gender == 'f' || gender =='F' ? "여" : "남", weight);

        System.out.println(result);
    }
}