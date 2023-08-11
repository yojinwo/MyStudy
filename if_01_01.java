public class if_01_01 {

    /*
     * 문자열 my_string과 정수 n이 매개변수로 주어질 때,
     * my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
     * 
     * 제한사항
     * my_string은 숫자와 알파벳으로 이루어져 있습니다.
     * 1 ≤ my_string의 길이 ≤ 1,000
     * 1 ≤ n ≤ my_string의 길이
     */
    public static void main(String[] args) {
        String control = "w" + "a" + "s" + "d";
        int n = 10;

        for (int i = 0; i < control.length(); i++) {
            if (control.substring(i, i + 1).equals("w")) {
                n += 1;
            } else if (control.substring(i, i + 1).equals("a")) {
                n -= 10;
            } else if (control.substring(i, i + 1).equals("s")) {
                n -= 1;
            } else if (control.substring(i, i + 1).equals("d")) {
                n += 10;
            }    
        }
        // System.out.println(control.substring(1, 2));
        System.out.println(n);
    }
}

// 동원할 것 : 배열, charAt 메소드
// 1. 문자열 변수 선언 및 초기화
// 2.
//
// ex. "01234"
// string.length = 5;
// charAt(1~4)
// length - n
//