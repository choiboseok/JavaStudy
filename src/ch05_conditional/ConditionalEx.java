package ch05_conditional;

import java.util.Scanner;

/**
 * class Name 	: ConditionalEx
 * Author	  	: BoSeok
 * Created Date : 2025. 1. 24.
 * Version	  	: 1.0
 * Purpose	  	: java 기초
 * Description	: if문 문제
 */
public class ConditionalEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //new를 선언시 사용할 수 있는 새로운 객체를 만들어낸다는 뜻
		System.out.println("숫자를 입력해주세요:");
		String string = scan.nextLine();
		int num = Integer.parseInt(string);
//		int num = scan.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("짝수입니다.");
		} else System.out.println("홀수입니다.");
	}
}