package numberstring;

public class CharString {
    public static void main(String[] args) {
        System.out.println('생');
        System.out.println("생활코딩");
        System.out.println("생");
        System.out.println("생활코딩"+"입니다");

        System.out.println("egoing said \"Welcome programming world\"");
        System.out.println("egoing said\n \"Welcome programming world\"");
        /**
         * 문자 하나는 '(작은따옴표)' 로 감싼다.
         * 문자열은 "(큰따옴표)" 로 감싼다.
         * But, 하나의 문자를 큰따옴표로 감싼다고 에러가 발생하진 않는다.
         * Because, 한 글자도 문자열이 될 수 있기 때문이다.
         * 문자열과 문자열을 결합할때도 +(연산자) 를 쓸 수 있다.
         * 만약 문자열 안에 큰 따옴표를 넣고 싶다면, \(역슬래쉬) 를
         * 내가 큰 따옴표를 넣고 싶은 문장 앞에 쓰면 그 큰따옴표를 문자열의 시작과 끝을 구분하는 구분자가 아닌
         * 단순한 큰 따옴표로 해석시킨다. 이러한 기법을 escape 라고 한다.
         * (역슬래쉬)\n 을 하면 그 뒤의 내용부터, 줄 바꿈이 된다.
         */
    }

}
