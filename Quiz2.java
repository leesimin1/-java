import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문제1) 사용자에게서 국어,영어,수학 점수를 각각 입력받고,평균 점수 및 총점, 등급을 출력하는 프로그램 작성
        //$등급은 95이상 A+ , 90이상 A , 85이상 B+ , 80 이상 B ,70이상 C , 60이상 D , 60미만F
        // 출력 예시 > 당신의 총점은 xxx점이고, 평균은 xx.x점이고, 등급은 x입니다
        System.out.print("국어 , 영어 , 수학 점수를 입력하시오 ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a + b + c;
        int e = (a + b + c)/3;

        if (e >= 95) {
            System.out.println("당신의 총점수는" + d + "점이고, 평균점수는" +e+"등급은 A+입니다");
        } else if (e >= 90) {
            System.out.println("당신의 점수는" + d + "점이고, 평균은" +e+" 등급은 A입니다");
        } else if (e >= 85) {
            System.out.println("당신의 점수는" + d + "점이고, 평균은"+e+" 등급은 B입니다");
        } else if (e >= 80) {
            System.out.println("당신의 점수는" + d + "점이고, 평균은 "+e+" 등급은 B+입니다");
        } else if (e >= 70) {
            System.out.println("당신의 점수는" + d + "점이고, 평균은 "+e+" 등급은 C입니다");
        }
        else if (e >= 60) {
            System.out.println("당신의 점수는" + d + "점이고, 평균은 "+e+" 등급은 D입니다");
        }
        else if (e > 60) {
            System.out.println("당신의 점수는" + d + "점이고, 평균은 "+e+" 등급은 F입니다");
        }
        else if (e > 80) {
            System.out.println("당신의 점수는" + d + "점이고, 평균은 "+e+" 등급은 b입니다");
        }






    //문제2) 책 87p 4번
    //문제3) 책 88p 6번
    //문제4) 책 89p 9번

    }
}
