//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        final  float YEAR = 365.2422f;
        float temp;
        int day;
        int hour;
        int minute;
        int second;

        day = (int) YEAR;

        temp = YEAR - day;
        temp *= 24;
        hour = (int) (temp);

        temp -= hour;
        temp *= 60;
        minute = (int) (temp);

        temp -= minute;
        temp *= 60;
        second = (int) (temp + 0.5);

        System.out.printf("1년은 %.4f인데 이것은\n" +
                "%d일 %d시간 %d분 %d초 입니다.\n",YEAR, day, hour,minute,second);
    }
}