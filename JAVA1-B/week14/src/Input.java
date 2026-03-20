import java.util.Scanner;

public class Input {
    // 한 학생의 성적 입력 (반환값: 한 학생의 성적)
    static int[] inputOneStudent(String ban, String name, String gender) {
        Scanner keyboard = new Scanner(System.in);
        int[] scores;
        int kor, eng, math, select;
        String subjectName;

        scores = new int[4];

        // 국어 입력
        kor = inputScore(keyboard, ban, name, "국어");
        scores[0] = kor;

        // 영어 입력
        eng = inputScore(keyboard, ban, name, "영어");
        scores[1] = eng;

        // 수학 입력
        math = inputScore(keyboard, ban, name, "수학");
        scores[2] = math;

        // 선택과목 입력
        if(gender.equals("남")) {
            subjectName = "기술";
        } else {
            subjectName = "가정";
        }
        select = inputScore(keyboard, ban, name, subjectName);
        scores[3] = select;

        return scores;
    }

    // 점수 입력 (0-100 검증)
    static int inputScore(Scanner keyboard, String ban, String name, String subject) {
        int score;

        while(true) {
            System.out.printf("%s반 학생 %s의 %s 점수 입력 : ", ban, name, subject);
            score = keyboard.nextInt();

            if(score < 0 || score > 100) {
                System.out.println("ERROR : 점수는 0에서 100 사이여야 합니다. 다시 입력하세요.");
            } else {
                break;
            }
        }

        return score;
    }

    // 전체 학생 성적 입력
    static void inputScores(String[][][] students, int[][][] score) {
        int i, j;
        String ban, name, gender;
        int[] studentScore;

        for(i = 0; i < students.length; i++) {
            ban = String.valueOf(i + 1);
            System.out.printf("\n*** %s반 성적 입력 ***\n", ban);

            for(j = 0; j < students[i].length; j++) {
                name = students[i][j][1];
                gender = students[i][j][2];

                studentScore = inputOneStudent(ban, name, gender);
                score[i][j][0] = studentScore[0];
                score[i][j][1] = studentScore[1];
                score[i][j][2] = studentScore[2];
                score[i][j][3] = studentScore[3];
            }
        }
    }
}
