import java.util.Scanner;

public class IFEx {
    public static void main(String[] args) {
        int score = 95;

        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 점수를 입력해주세요");

        // 단순 if문 : 프로그램의 정상적인 흐름에서 조건식의 결과가 ture일 경우 추가적으로 더 실행하는 방식
        if (score > 90) {
            System.out.println("점수가 90보다 큽니다  ");
            System.out.println("등급은 A입니다");
        }
        if (score < 90) {
            System.out.println("점수가 90보다 작습니다");
            System.out.println("등급은 b입니다");
        }

        System.out.println("당신의 소지금약을 알려주세요");
        int money = sc.nextInt();

        System.out.println("점심 먹으러 중화요리점에 갑니다");


        if (money >= 12000) {
            System.out.println("자장면과 군만두를 주문 합니다");

        } else {
            System.out.println("짜장면만 주문 합니다");
        }

        System.out.println("음식을 맛있게 먹습니다");
    }
}
