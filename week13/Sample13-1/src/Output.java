public class Output {

    display();
    System.out.println("이름  국어 영어  수학 총점");
    display();
    for(int i = 0; i < name.length; i++)

    {
        System.out.printf("%3 %3d %3d %3d %3d\n", score[i][0],score[i][1],score[i][2],score[i][3]);
    }
    display();
}
private void display(){
    System.out.println("*****************************************");
}
}
