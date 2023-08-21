package com.mystudy.study02_animalPackage;

public class Person {
    String name = "";

    Person (String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        
       //생성자 호출
       CatMom myCat = new CatMom("미미");
       
       System.out.println("반려묘의 이름 : " + myCat.name);
 

       myCat.heardCatBabySound();
       
       Person p1 = new Person("유진우");
       p1.heardCatMomSound();
       p1.giveRice();
       
     
        
    }

    void heardCatMomSound () {
        System.out.println();
        System.out.println("집사여! 새끼들 젖을 줄 수 있도록 영양분을 보충하려 한다.");
        System.out.println("사료를 다오.");
    }

   void giveRice () {
     System.out.println();
     CatMom.eat();
    }
}
