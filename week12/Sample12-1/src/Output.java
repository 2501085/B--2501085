import java.util.Scanner;

public class Output {
    //Method Overload (중복정의)
    static void display(int first, int second, int result) {
        System.out.printf("%d + %d = %d\n", first,second,result);
    }


    static void display(int first, int second) {
        System.out.printf("%d + %d = ", first,second);
    }



    static  void  display(){
        System.out.printf("****************************************\n");
    }
}
