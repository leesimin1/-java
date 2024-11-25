import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        //책 87p 1,2,3번 문제

        // 키보드 입력을 받기위한 스케너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 키보드로 정수를입력 받을변수 선언
        System.out.print("두 정수를 입력하세요");
        // 키보드로 정수 입력 받기, 숫자가 아닐경우 오류 발생
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        // 출력, a+b
        System.out.println(input1 + "+" + input2 + "은" + (input1+input2) );

        System.out.print("몇층인지 입력하세요");
        // 키보드로 입력된 정수 받아오기
        int input3 = sc.nextInt();
        System.out.println(input3*5);

        System.out.print("x 값을 입력하세요");
        int input4 = sc.nextInt();
        // 기본 자바 연산자에 제좁 연산자가 없음 , 제곱 연산을 위해서는 입력값 * 입력값으로 처리
        int intput5 = (input4*input4-(3*input4)+7);
        System.out.print("x="+input4 +","+"y="+intput5);







    }
}
