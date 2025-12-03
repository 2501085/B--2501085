import java.util.Scanner;

public class Input {
    static long readData(String msg) {
        Scanner keyboard = new Scanner(System.in);
        long temp;
        System.out.print(msg);
        temp = keyboard.nextLong();
        return temp;
    }
}
