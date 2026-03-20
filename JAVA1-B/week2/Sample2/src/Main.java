import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name = "홍길동"; //선언문 (준비)

        name = keyboard .nextLine(); //Data 입력

        //처리

        System.out.println("입력 받은 이름 : " +name);

    }
}