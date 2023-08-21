package com.mystudy.study02_animalPackage;

public class CatBaby extends CatMom {
    
    String name = "";
   
    CatBaby (String name) {
       super("고양이들");
    }

    void catBabySound () {
        System.out.println("엄마! 배고파요! 젖주세요!");
    }
}
