import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TwoSecret twoSecret = new TwoSecret();
        String answer = twoSecret.sol("aukks", "wbqd", 5);
        // sol 메소드의 반환값인 ansarr을 사용하여 원하는 작업 수행
        System.out.println("결과: " + answer); // 결과 출력
    }
}