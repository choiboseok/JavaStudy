package ch03_system;

import java.util.Scanner;

/**
 * class Name 	: SystemMain
 * Author	  	: BoSeok
 * Created Date : 2025. 1. 22.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: [설명을 작성하세요]
 */
public class SystemMain 
{
	public static void main(String[] args) 
	{
		System.out.print("hi");
		System.out.print("hello");
		System.out.println();
		System.err.println("오류 표시");

		System.out.println("Hello \nWorld");
		System.out.println(" \"안녕\" ");
		
		System.out.printf("원주율은 %.2f \n", 3.141592);
		System.out.printf("%d 명이 %s 듣고 있습니다.", 17, "java수업");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름나이를 입력하세요");
		String userInput = scan.nextLine();
		System.out.println(userInput);
	}
}
