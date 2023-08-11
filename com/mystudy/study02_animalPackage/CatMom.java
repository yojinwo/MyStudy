package com.mystudy.study02_animalPackage;

public class CatMom extends Person{
    
  
    //CatMom의 필드(속성)

    CatMom (String name) {
        super("미미");
    }

    
    //CatMom의 메소드 (새끼들이 밥달라고 아우성이다!)
   
   void heardCatBabySound() {
    CatBaby b1 = new CatBaby("턱시도");
    CatBaby b2 = new CatBaby("고등어");
    CatBaby b3 = new CatBaby("치즈");
    b1.catBabySound();
    b2.catBabySound();
    b3.catBabySound();

    }

    static void eat () {
        System.out.println("아싸! 냠냠!");
    }
    
   
}
