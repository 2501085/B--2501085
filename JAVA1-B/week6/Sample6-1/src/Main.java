//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        final int SouthKOREA = 99720;
        final int NorthKOREA = 122762;
        final int USA = 9631418;
        final int JAPAN = 377873;

        float temp1 = (float) NorthKOREA / SouthKOREA;
        float temp2 = (float) USA / SouthKOREA;
        float temp3 = (float) JAPAN / SouthKOREA;

        System.out.printf("대한민국의 면적: %,d ㎢\n",SouthKOREA);
        System.out.printf("북한의 면적: %,d ㎢\n",NorthKOREA);
        System.out.printf("미국의 면적: %,d ㎢\n",USA);
        System.out.printf("일본의 면적: %,d ㎢\n",JAPAN);

        System.out.printf("북한은 우리나라에 비해 %.2f 배임.\n", temp1);
        System.out.printf("미국은 우리나라에 비해 %.2f 배임.\n", temp2);
        System.out.printf("일본은 우리나라에 비해 %.2f 배임.\n", temp3);

    }
}