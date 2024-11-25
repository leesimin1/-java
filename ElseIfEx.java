import java.util.Scanner;

public class ElseIfEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 점수를 입력해주세요");
        int score = sc.nextInt();

        // if ~ else if ~ else문 : 한번의 조건문에 여러거자의 조건식을 사용하여
        // 해당 조건에 맞는 값이 있을경우 해당코드 블럭을 실행하는 if문
        // if~else if~else 문의 마지막에 있는 else 문은 필수가 아님 생략가능
        // 조건에 해당하지 않으면 출력안함
        // 조건식에 나올수있는 모든 조건식읋 다 입력시 간으
        // 개발자가 의도적으로 생략할수있음

        // 주의사항
        // if~else
        // 조건식은 단계적으로 입력해야함
        if (score >= 90) {
            System.out.println("당신의 점수는" + score + "점이고, 등급은 A입니다");
        } else if (score >= 80) {
            System.out.println("당신의 점수는" + score + "점이고, 등급은 B입니다");
        } else if (score >= 70) {
            System.out.println("당신의 점수는" + score + "점이고, 등급은 C입니다");
        } else if (score >= 60) {
            System.out.println("당신의 점수는" + score + "점이고, 등급은 D입니다");
        } else if (score >= 50) {
            System.out.println("당신의 점수는" + score + "점이고, 등급은 F입니다");
        }
    }
}





