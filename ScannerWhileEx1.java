/* 섹션8.훈련-문제와풀이3 - <이름과 나이 반복>
조건 1.이름과 나이를 반복해서 입력받고 출력하는 프로그램
2. "종료"를 입력하면 프로그램이 종료되어야 함
 */
package scanner.ex;
import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("이름을 입력하세요(종료를 입력하면 종료): ");
            String name = scanner.nextLine();
            if (name.equals("종료")) { //변수.equals는 변수 //
                System.out.println("시스템을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt(); // 숫자\n 중 숫자만 가져가는 것
            scanner.nextLine();// \n 남은 라인 읽고 버리는 것
            System.out.println("이름은 : " + name + " 나이는 : " + age);



        }
    }
}
