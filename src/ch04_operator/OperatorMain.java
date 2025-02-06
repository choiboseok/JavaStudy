package ch04_operator;

import java.util.Scanner;

/**
 * class Name 	: OperatorMain
 * Author	  	: BoSeok
 * Created Date : 2025. 1. 23.
 * Version	  	: 1.0
 * Purpose	  	: java 기초
 * Description	: 기본 연산자
 */
public class OperatorMain 
{
	public static void main(String[] args) 
	{
		 int num = 10;
		 num++;
		 System.out.println("++이후" + num);
		 num--;
		 System.out.println("--이후" + num);
		 
		 int a,b ;
		 a = num++;
		 b = ++num;
		 System.out.printf("a:%d, b:%d \n", a, b);
		 
		 int c = 1;
		 c += 2;
		 System.out.println("c:" + c);
		 c *= 10;
		 System.out.println("c:" + c);
		 
		 System.out.println(10 + 5);
		 System.out.println(10 - 5);
		 System.out.println(10 * 5);
		 System.out.println(10 / 5);
		 System.out.println(10 % 5);
		 
		 int num1 = 10;
		 int num2 = 20;
		 System.out.println("== 비교 연산자 ==");
		 System.out.printf("num1:%d vs num2:%d", num1, num2);
		 System.out.println(num1 >  num2);
		 System.out.println(num1 <  num2);
		 System.out.println(num1 >= num2);
		 System.out.println(num1 <= num2);
		 System.out.println(num1 != num2);
		 System.out.println(num1 == num2);
		 
		 String msg = (a > 9) ? "a가 9보다 큼" : "a가 9보다 작음";
		 System.out.println(msg);
		 Scanner scan = new Scanner(System.in);
		 String userInput = scan.nextLine();
		 int len = userInput.length();
		 System.out.println("문자열 길이:" + len);
		 String output = len >= 4 ? "사용가능합니다." : "4자리 이상으로 다시 입력!";
		 System.out.println(output);
		 
		 System.out.println(" === 논리 연산 ===");
		 System.out.println("아이디를 입력하세요(8 ~ 14자리)");
		 System.out.println(">>>");
		 String userInput2 = scan.nextLine();
		 int len2 = userInput2.length();
		 String output2 = (len2 >= 8 && len2 <15) ? "가능" : "불가능";
		 System.out.println(output);
		 
		 System.out.println("성적을 입력하세요:");
		 System.out.println(">>>");
		 String userInput3 = scan.nextLine();
		 int grade = Integer.parseInt(userInput3);
		 String output3 = (grade >= 90) ? "A" : ((grade >= 80)? "B" : "C");
		 System.out.println(output3);
		 /*
		 if(grade >= 90) { System.out.println("A"); }
		 else if(grade >= 80) {System.out.println("B"); }
		 else System.out.println("C");
		 */
		 
		 /*
		 while(true)
		 {
			 System.out.println("아이디를 입력해주세요(4자리 이상)");
			 System.out.println(">>>");
			 Scanner scan1 = new Scanner(System.in);
			 String userInput1 = scan.nextLine();
			 if(userInput1.length() >= 4)
			 {
				 System.out.println("사용 가능합니다.");
				 break;
			 }
			 else System.out.println("다시 입력해주세요");
		 }
		 */
	}
}
