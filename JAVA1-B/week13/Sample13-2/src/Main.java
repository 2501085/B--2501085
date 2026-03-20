//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
        privite static int subNumber(int... number) {

            int total = 0;
            for (int i = 0; i < number.length; i++)
                total +=numbers[i];
            return total;
        }

        public static void main(String[] args){

            System.out.println(subNumber(1,3,4));
            System.out.println(subNumber(3,6,7,9,12));
    }
}