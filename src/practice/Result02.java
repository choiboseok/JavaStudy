package practice;

import java.util.Random;
import java.util.Scanner;

public class Result02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int rand = random.nextInt(51);
		int i=1;
		while(i<=5)
		{
			System.out.printf("숫자를 입력해주세요 : ");
			int num = scan.nextInt();
			
			if(i == 5) {
				System.out.printf("실패하였습니다. 정답은 %d입니다.", rand);
				break;
			}
			
			if(rand > num) {
				System.out.println("다운!!");
				System.out.printf("기회가 %d번 남았습니다\n", (5-i));
			} else if(rand < num) {
				System.out.println("업!!");
				System.out.printf("기회가 %d번 남았습니다\n", (5-i));
			} else if(rand == num) {
				System.out.println("정답입니다.");
				break;
			}
			i++;
		}
		

	}
}
