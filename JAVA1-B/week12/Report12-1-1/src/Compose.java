public class Compose {
    static int max(int first, int second) {
        int result;

        if(first > second) {
            result = first;
        }
        else {
            result = second;
        }

        return result;
    }

    static int max4(int num1, int num2, int num3, int num4) {
        int temp1, temp2;
        int result;

        temp1 = max(num1, num2);
        temp2 = max(num3, num4);
        result = max(temp1, temp2);

        return result;
    }
}
