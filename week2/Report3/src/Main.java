import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("당신의 이름은? ");
        String name = keyboard.nextLine();
        System.out.printf("%s님의 가족은 몇명입니까? ", name);
        int count = keyboard.nextInt();
        keyboard.nextLine();
        System.out.printf("%s님의 가족은 어디에서 살지요? ", name);
        String address = keyboard.nextLine();

        System.out.printf("%s님의 가족은 %d명입니다.\n", name, count);
        System.out.printf("%s님의 가족은 %s에서 살고 있습니다.\n", name, address);
    }
}