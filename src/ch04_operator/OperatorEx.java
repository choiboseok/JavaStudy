package ch04_operator;

import java.util.Scanner;

/**
 * class Name 	: OperatorEx
 * Author	  	: BoSeok
 * Created Date : 2025. 1. 23.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: 연산자 엽습문제
 */
public class OperatorEx 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("=== 이메일 주소를 입력해주세요");
		String userInput = scan.nextLine();
		String output = (userInput.indexOf("@") == 1)? "사용 가능합니다." : "사용 불가능합니다.";
		System.out.println(output);
	}
}
