package ch05_conditional;

import java.util.Scanner;

/**
 * class Name 	: LoopWhile
 * Author	  	: BoSeok
 * Created Date : 2025. 1. 24.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: 반복문 while
 */
public class LoopWhile {
	public static void main(String[] args) {
		/*
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag)
		{
			System.out.println("===================");
			System.out.println("이름을 입력하세요(종료q)");
			String nm = scan.nextLine();
			if(nm.equals("q"))
			{
				flag=false;
			}
			else System.out.println(nm + "님 환영합니다.");
		}
		
		while(true)
		{
			System.out.println("===================");
			System.out.println("이름을 입력하세요(종료q)");
			String nm = scan.nextLine();
			if(nm.equals("q"))
			{
				break;
			}
			else System.out.println(nm + "님 환영합니다.");
		}
		scan.close();
		*/
		int i=2;
		while(i <= 9)
		{
			int j=1;
			while(j <= 9)
			{
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				j++;
			}
			i++;
		}
	}
}