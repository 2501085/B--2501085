public class Compose {
    // 학번 홀수: int 반환 (1: 윤년, 0: 평년)
    static int leapYear(int year) {
        int result;

        if(year % 400 == 0) {
            result = 1;  // 윤년
        }
        else if(year % 100 == 0) {
            result = 0;  // 평년
        }
        else if(year % 4 == 0) {
            result = 1;  // 윤년
        }
        else {
            result = 0;  // 평년
        }

        return result;
    }
}
