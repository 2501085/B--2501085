//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        String[][] students = new String[][] {{"홍길동","남",""},{"강성우","남",""},
                {"김소이","여",""},{"김준석","남",""},{"장한별","여",""},{"조민기","남",""},
                {"최장빈","남",""},{"황연준","여",""}, {"파트마","여",""},{"미라츠","남",""}};

        int[] height = new int[students.length];
        float[][] weight = new float[students.length][3]; // 몸무게,표준 체중,BMI

        Input.readData(students, height);
        Input.readData(students, weight);

        Compute.standard(students,height,weight);
        Compute.bmi(students,height,weight);
        Compute.check(students,weight);

        Output.display(students,height,weight);
    }
}