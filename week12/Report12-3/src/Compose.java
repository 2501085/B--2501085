public class Compose {
    static String convertHangul(long money) {
        String result;
        String[] hanNum;
        String[] hanUnit;
        String[] hanBigUnit;
        long[] parts;
        int partCount;

        result = "";
        hanNum = new String[]{"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
        hanUnit = new String[]{"", "십", "백", "천"};
        hanBigUnit = new String[]{"", "만", "억", "조"};

        if(money == 0) {
            return "영원";
        }

        parts = new long[4];
        partCount = 0;

        // 4자리씩 분리
        while(money > 0 && partCount < 4) {
            parts[partCount] = money % 10000;
            money = money / 10000;
            partCount++;
        }

        // 큰 단위부터 변환
        for(int p = partCount - 1; p >= 0; p--) {
            if(parts[p] == 0) {
                continue;
            }

            long num;
            int[] digits;

            num = parts[p];
            digits = new int[4];

            for(int i = 0; i < 4; i++) {
                digits[i] = (int)(num % 10);
                num = num / 10;
            }

            // 천의 자리
            if(digits[3] != 0) {
                if(digits[3] != 1) {
                    result = result + hanNum[digits[3]];
                }
                result = result + hanUnit[3];
            }

            // 백의 자리
            if(digits[2] != 0) {
                if(digits[2] != 1) {
                    result = result + hanNum[digits[2]];
                }
                result = result + hanUnit[2];
            }

            // 십의 자리
            if(digits[1] != 0) {
                if(digits[1] != 1) {
                    result = result + hanNum[digits[1]];
                }
                result = result + hanUnit[1];
            }

            // 일의 자리
            if(digits[0] != 0) {
                result = result + hanNum[digits[0]];
            }

            // 만, 억, 조 단위
            if(p > 0) {
                result = result + hanBigUnit[p];
            }
        }

        return result;
    }
}
