//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        // int[][] salse = new int[3][5]; //{년도, 1분기, 2분기, 3분기, 4분기, 합계} * 3

        int[][] salse = {{2010, 11230, 12345, 21495, 21543,0},
                {2011, 12387, 11288, 22191, 23465,0},
                {2012, 11675, 11678, 23215, 22701,0}};

        float[] avg = new float[salse.length];


        for (int i = 0; i <salse.length; i++){
            for (int j = 1; j < salse[i].length - 1; j++){
                salse[i][salse[i].length - 1] += salse[i][j];
            }
        }

        for (int i = 0; i <salse.length; i++)
            avg[i] = salse[i][salse[i].length - 1] / 4.0f;


        System.out.println("**************************************");
        System.out.println(" 년도 1분기  2분기  3분기  4분기  합계");
        System.out.println("**************************************");
        for (int i = 0; i < salse.length; i++) {
            System.out.printf("%4d년 %,7d %,7d %,7d %,7d %,8d %,9.0f\n"
                    ,salse[i][0],salse[i][1],salse[i][2],salse[i][3],salse[i][4],salse[i][5],avg[i]);
        }
        System.out.println("**************************************");
    }
}