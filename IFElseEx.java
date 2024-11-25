import java.util.Scanner;

public class IFElseEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 점수를 입력하세요");
        int score = sc.nextInt();

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다");
            System.out.println("등급은 A입니다");
        }

        else{
            System.out.println("점수가 90보다 작습니다");
            System.out.println("등급은 B입니다");
        }

        System.out.println("\n");

        System.out.println("현재 먹고 싶은 음식이름을 입력하세요");
        String food = sc.next();

        System.out.println("점심을 먹으러 중화요리점에 갑니다");
        if (food.equals("짜장면")){
            System.out.println("짜장면을 주문합니다");
        }
        else{
            System.out.println("짬뽕을 주문합니다 ");
        }
    }
}
