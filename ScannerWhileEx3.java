/* 섹션8.훈련-문제와풀이4 - <입력한 숫자의 합겨와 평균>
조건 1.여러개의 숫자를 입력받아 합계와 평균 계산, 마지막에는 -1을 입력하여 숫자입력을 종료
2. 모든 숫자의 입력이 끝난 후 sum 과 평균 average를 출력 , 평균은 소수점 아래까지 계신
*/
package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sum = 0;
        int count = 0;
        while (true) {
            count++;
            System.out.println("숫자 계속 입력하세요(-1입력 시 종료)");
            long a = input.nextLong();
            sum= a + sum;
            long average = sum / count;
            System.out.println("합은 : " + sum + "평균은 : " + average);

            if ( a == -1) {
                System.out.println("종료합니다");
                break;
            }
        }


    }
}
/*
0+1=3= 4
4/3 = 1.XX
한번 돌 때 COUNT1 증가
sum / count = average (Long형)
*/