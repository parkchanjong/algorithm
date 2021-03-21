package Digits;
import java.util.*;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;

        System.out.println("2가지의 정수를 입력하세요");

        do {
            System.out.println("입력: ");
            no = scanner.nextInt();
        } while (no < 10 || no > 99);

        System.out.println("변수 no의 값은 " + no + "가 되었습니다.");
    }
}
