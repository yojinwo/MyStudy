package oop;

public class Car {
    
    //필드 선언
    //Car라는 객체에 속성을 선언한다.

    int gas;

    //리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    void setGas(int gas) {
        this.gas = gas;
    }

    //리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를 0이 아니면 true를 리턴

    boolean isLeftgas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    
        
    }
}
