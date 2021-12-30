package org.opentutorials.javatutorials.operator;

public class DivisionDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 3; // 정수 int 형 선언

        float c = 10.0F;
        float d = 3.0F; // 실수 float 형 선언 (뒤에 F)

        System.out.println(a/b); // 결과값 3, 정수끼리 나누는거라 소수점 버림
        System.out.println(c/d); // 결과값 3.3333~ , 실수끼리 나누는거라 소수점 낭비 안하고 가져감
        System.out.println(a/d);
    // 결과값 3.3333~ , 나누는 d가 실수형이라, a도 같이 실수형으로 자동 형 변환 되어서
    // 둘다 실수형이 되어서, 위의 결과값과 같은 소수점을 가져가는 결과값 3.3333~ 이 나옴.

    }
}
