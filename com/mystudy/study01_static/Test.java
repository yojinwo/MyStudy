package com.mystudy.study01_static;

public class Test {

    public static void main(String[] args) {

        int c = 100;
        c = 0;
        c = 200;

        Test1 t1 = new Test1();

       
        int e = t1.A;
        // t1.a = 300; // a는 상수라 오른쪽에 대입 연산자 안됨
        t1.b = 300; // 상수 아니라 변경 가능

        Test1.d = 400;
        t1.d = 500; // 인스턴스 변수로 접근했기 때문에 static access way가 뜬다.

        System.out.println(Test1.d); // 500 -> 코드가 순차적으로 실행되기에, 19번행에서 컴퓨터가 500으로 저장된 변수 d를 출력하여 500이 되는 것
        System.out.println(t1.d); // 500

    }
}

class Test1 {
    int b = 100;
    final int A = 200;
    static int d = 300;
    
    // 이건 우연히 발견한 것 -> 중괄호안에 변수만 저장도 가능..?
    {
        b = 0;
        b = 200;
    }

}

// 클래스 Test1 분석
// Syntax error on token ";", { expected after this token
// 상기 문구는 키워트 누락 or main() 누락의 경우 발생한다.
// Test1의 경우 메인 메소드가 없는 클래스이다. 메인 메소드란 실행(엔트리 포인트)이기 때문에 코드를 순차적으로 실행하면서
// 변수에 저장할 데이터를 변경할 수 있다.
// 하지만 Test1의 int b의 경우 엔트리 포인트가 아니기 때문에 변수 b에 처음 값을 저장후 같은 클래스내에서 그 값을 변경할 수
// 없다.
// https://developyo.tistory.com/278