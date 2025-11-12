import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        String[] name = new String[] {"홍길동", "이재명", "윤석열", "경복대","오세훈","강민성","김진성","니키타","김정은","김시온"};
        String[] hakbun = {"2501002","2501004","2501005","2501014","2501024",
                "2501032","2501044","2501055","2501064","2501074"};
        int[] kor = new int[name.length];
        int[] eng = new int[name.length];
        int[] math = new int[name.length];
        int[] total = new int[name.length];
        int[] rank = new int[name.length];
        float[] avg = new float[name.length];

        int i = 0;
        boolean swapped = false;
        while (i < name.length) {
            System.out.printf("%s 학생의 국어 성적 입력 : ", name[i]);
            kor[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 영어 성적 입력 : ", name[i]);
            eng[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 수학 성적 입력 : ", name[i]);
            math[i] = keyboard.nextInt();


            if ((kor[i] >=0 && kor[i]<= 100) &&
                    (eng[i] >=0 && eng[i]<= 100) &&
                    (math[i] >=0 && math[i]<= 100)){
                i++;
            }else {
                System.err.println("ERRPR : 0 ~ 100");
                System.in.read();
            }
        }


        for (i = 0; i < name.length; i++){
            total[i] = kor[i]+eng[i]+math[i];
        }

        for (i = 0; i < name.length; i++) {
            avg[i] = total[i] / 3.0f;
        }


        for (i = 0; i < name.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < name.length - 1 - i; j++) {
                if (avg[j] < avg[j + 1]) {
                    // avg 교환
                    float tempAvg = avg[j];
                    avg[j] = avg[j + 1];
                    avg[j + 1] = tempAvg;

                    // total 교환
                    int tempTotal = total[j];
                    total[j] = total[j + 1];
                    total[j + 1] = tempTotal;

                    // name 교환
                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;

                    // hakbun 교환
                    String tempHakbun = hakbun[j];
                    hakbun[j] = hakbun[j + 1];
                    hakbun[j + 1] = tempHakbun;

                    // kor 교환
                    int tempKor = kor[j];
                    kor[j] = kor[j + 1];
                    kor[j + 1] = tempKor;

                    // eng 교환
                    int tempEng = eng[j];
                    eng[j] = eng[j + 1];
                    eng[j + 1] = tempEng;

                    // math 교환
                    int tempMath = math[j];
                    math[j] = math[j + 1];
                    math[j + 1] = tempMath;

                    swapped = true;
                }
            }
            // 교환이 없으면 정렬 완료
            if (!swapped) break;
        }

        // 등수 계산
        for (i = 0; i < name.length; i++)
            rank[i] = i + 1;

        // 동점자 처리
        for (i = 0; i < name.length - 1; i++) {
            if (avg[i] == avg[i + 1])
                rank[i + 1] = rank[i];
        }


        for (i = 0; i <name.length; i++)
            rank[i] = i + 1;

        for (i =0; i < name.length -1; i++) {
            if (avg[i] == avg[i + 1])
                rank[i + 1] = rank[i];
        }


        System.out.println("*****************************************************");
        System.out.println("학번   이름    국어    영어    수학    총점   평균   등수");
        System.out.println("*****************************************************");
        for (i = 0; i < name.length; i++) {
            System.out.printf("%7s %3s  %3d  %3d  %3d  %3d  %5.1f  %2d\n",
                    hakbun[i], name[i], kor[i], eng[i], math[i], total[i], avg[i], rank[i]);
        }
        System.out.println("*****************************************************");

    }
}