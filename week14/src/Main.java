//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        String[][][] students;
        int[][][] score;
        int[][][] total;
        float[][] avg;
        int[][] classRank;
        int[][] gradeRank;
        float[] classAvg;
        float gradeAvg;
        int i;

        // 학생 신상 데이터 초기화 (동적 할당)
        students = new String[3][][];
        students[0] = new String[][]{
                {"2101234", "정서윤", "여"}, {"2101235", "경복대", "여"},
                {"2101236", "한국인", "남"}, {"2101345", "정상인", "여"}};
        students[1] = new String[][]{
                {"2301345", "구자철", "남"}, {"2301435", "이가을", "여"},
                {"2301443", "김광현", "남"}, {"2301678", "박종철", "남"},
                {"2301679", "올시즌", "여"}};
        students[2] = new String[][]{
                {"2401234", "한민국", "여"}, {"2401456", "안우진", "남"},
                {"2401789", "이대한", "남"}};

        // 성적 관련 배열 초기화
        score = new int[students.length][][];
        total = new int[students.length][][];
        avg = new float[students.length][];
        classRank = new int[students.length][];
        gradeRank = new int[students.length][];
        classAvg = new float[students.length];

        // 각 반별 배열 크기 설정
        for(i = 0; i < students.length; i++) {
            score[i] = new int[students[i].length][4];
            total[i] = new int[students[i].length][1];
            avg[i] = new float[students[i].length];
            classRank[i] = new int[students[i].length];
            gradeRank[i] = new int[students[i].length];
        }

        // 성적 입력
        Input.inputScores(students, score);

        // 총점 계산
        Compute.calculateTotal(score, total);

        // 평균 계산
        Compute.calculateAvg(total, avg);

        // 반 평균 계산
        Compute.calculateClassAvg(total, classAvg);

        // 학년 평균 계산
        gradeAvg = Compute.calculateGradeAvg(total);

        // 반 석차 계산
        Compute.calculateClassRank(total, classRank);

        // 학년 석차 계산
        Compute.calculateGradeRank(total, gradeRank);

        // 학번 순으로 정렬
        Compute.sortByHakbun(students, score, total, avg, classRank, gradeRank);

        // 결과 출력
        Output.printResult(students, score, total, avg, classRank, gradeRank, classAvg, gradeAvg);
    }
}