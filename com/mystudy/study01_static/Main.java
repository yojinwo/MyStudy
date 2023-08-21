package com.mystudy.study01_static;


class Static{
  public int a=20; // 인스턴스 변수
  static int b=0; // 클래스 변수
}


public class Main {
  public static void main(String[] args) {
    int a= 10;
    Static.b = a;
    Static st = new Static();

    System.out.println(Static.b++); // 10 -> Static 클래스
     System.out.println(st.b); // 11 
     System.out.println(a); // 10
     System.out.println(st.a); // 20
  }
}