/* 섹션8.훈련-문제와풀이3 - <상품가격계산>
조건 1.가격 수량을 입력받고 총 비용(둘의 곱)을 출력
2. -1을 입력하여 가격 입력을 종료
 */
package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("상품의 가격? (-1을 입력하면 종료)");
            int price = input.nextInt();
            if (price == -1) {
                System.out.println("-1을 입력하여 종료합니다.");
                break;
            }
            System.out.println("상품의 수량? (-1을 입력하면 종료)");
            int quantity = input.nextInt();
            if (quantity == -1) {
                System.out.println("-1을 입력하여 종료합니다.");
                break;
            }
            int totalPrice = price * quantity;
            System.out.println("총 비용 : " + totalPrice);

        }
    }
}
