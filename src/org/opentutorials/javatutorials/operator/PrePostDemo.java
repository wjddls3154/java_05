package org.opentutorials.javatutorials.operator;

public class PrePostDemo {
    public static void main(String[] args) {

        int i = 3;
        i++; // i=i+1, 3+1 = 4
        System.out.println(i); // 4가 출력됨
        ++i;
        System.out.println(i); // 5가 출력됨
        System.out.println(++i); // 6이 출력됨, ++i는 괄호안에서 더해짐.
        System.out.println(i++); // 6이 출력됨, i++는 괄호안이 아닌 문장이끝나면 더해짐.
        System.out.println(i); // 7이 출력됨

    }
}
