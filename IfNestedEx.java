import javax.swing.*;

public class IfNestedEx {
    public static void main(String[] args) {

        // Math.rnadom(): 자바에서 제공하는 임의의 숫자를 출력하는 명령어
        // 0.0 ~0.9 까지의 임의의 수사를 출력
        // (math.random() * 정수)+1을 하게 되면 최소 1~지정한 정수까지 임의의 숫ㅅ자를 출력
        int score = (int) (Math.random() * 20) + 81;
        System.out.println("점수 :" + score);

        String grade = "";

        if (score >= 90) {
            if (score >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        }
            else {
                if (score>= 80);
            grade = "B+";
        }
            //else{
            //grade = "B";
        // }
        System.out.println("점수 :" + grade);
    }
}
