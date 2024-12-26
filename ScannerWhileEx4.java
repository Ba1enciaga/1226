/* 섹션8.훈련-문제와풀이4 - <상품구매>
조건 1.사용자로부터 상품정보(상품명 가격 수량)입력,총 가격출력
2.option 변수에 1.상품입력 2.결제 3. 프로그램 종료 옵션을 제공,  정수로 입력받음
2-1 결제옵션 선택 시 총 비용 출력 훟 총비용을 0으로 초기화
2-2 세가지 옵션 외에 다른 값을 입력하면 "올바른 옵션을 선택해주세요" 메시지 출력
*/
package scanner.ex;
import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.println("상품명을 입력하세요: ");
            String name = input.nextLine();
            System.out.print("상품 가격을 입력하세요: ");
            int price = input.nextInt();
            input.nextLine();
            System.out.print("구매 수량을 입력하세요: ");
            int count = input.nextInt();
            input.nextLine();
            int sum = price * count; // sum은 해당 상품의 비용
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();
            input.nextLine();
            if (option == 1) {
                a = sum + a; // a는 비용의 합
            }
            else if (option == 2 ) {
                a = sum + a; // a는 비용의 합
                System.out.println("총 비용: " + a);
                a = 0;
            }
            else if (option == 3) {
                System.out.println("프로그램을 종료합니다,");
                break;
            }
            else {
                System.out.println("다시 올바른 옵션값을 입력하세요");
            }
        }
    }
}
