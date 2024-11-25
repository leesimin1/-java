public class inceaseDecreaseOpEx {
public static void main(String[] args) {

    // int 타입의 변수 x 에 데이터 10저장
    int x =  10;

    // 화면 츌력
    System.out.println("x :" + x);
    // 증감 연산자 사용, 피연산자 앞에 사용
    ++x;
    System.out.println("x :" + x);
    // 증감 연산자사용, 피연산자 뒤에 사용
    x++;
    System.out.println("x :" + x);

    System.out.println("\n----------- \n");

    x= 10;

    System.out.println("x의 현재 값 :" + x);
    // 증감 연산자가 다른 연산식과 함께 사용시 변수앞에 사용하면 증감연산자가 먼저 실햄됨
    System.out.println("x값의 증가 :" + ++x);
    System.out.println("x의 현재값" + x);
    // 증감 연산자를 다른 연산식과 함께 사용시 변수뒤에 사용하면 증감 연산자가 나중에 실행됨
    System.out.println("x값 증가 :" + x++);
    System.out.println("x의 현재값 :" + x);
    // 증감 연산자를 다른 연산식과 함께 사용시 변수뒤에 사용하면 증감 연산자가 나중에 실행됨
    System.out.println("x값 감소 :" + --x);
    System.out.println("x의 현재값 :" + +x);
    // 증감 연산자가 다른 연산식과 함께 사용시 변수앞에 사용하면 증감연산자가 먼저 실햄됨
    System.out.println("x값 감소 :" + --x);
    System.out.println("x의 현재값 :" + x);


}

}
