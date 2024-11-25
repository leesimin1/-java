public class logicalOpEx {
    public static void main(String[] args) {


//       문자 A는 10진수로 65임
        int charCode = 'A';

        if ((charCode >= 65) && (charCode <=90) );
        {System.out.println("대문자 입니다 ");}

        if ((charCode >= 97) && (charCode <=122) );
        {System.out.println("소문자 입니다");}

        // charCode의 값이 65이므로 charCode < 48이므로 false이나 ! 연산에
        // 의해서 결과값이 ture 가 됨
        // charCode의 값이 64 이므로 charcode > 57은 fales 이나 ! 연산에 의해서
        // 결과값이 ture가 됨
        if(!(charCode >=48) && (charCode <=57)){
            System.out.println("0~9까지의 숫자입니다");
        }

        int value = 4;
        // value % 2 연산이 먼저 발생하고 결과값 == 0 연산이 진행 true
        // value & 3 연산이 먼저 발생하고 결과값 == 0 연산이 진행 false
        // 왼쪽 결과값 ture 와 오른쪽 결과값 fales를 or연산시 ture

        if ((value % 2 == 0 ) || (value % 3 == 0)){
            System.out.println("2 또는 3의 배수입니다");
        }



    }
}
