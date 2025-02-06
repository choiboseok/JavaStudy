package ch03_system;

import java.util.Scanner;

public class SystemEx 
{
	public static void main(String[] args) 
	{
		//1. 이름 나이 입출력
		//2. 이름 나이 입력 후 변수에 할당
		Scanner scan = new Scanner(System.in);
		System.out.println("이름:나이를 입력하세요");
		String userInput = scan.nextLine();
		System.out.println("1번문제 \n이름:" + userInput.substring(0, userInput.indexOf(":")) + "\n나이:" + userInput.substring(userInput.indexOf(":")+1));
		String user = userInput.substring(0, userInput.indexOf(":"));
		String age = userInput.substring(userInput.indexOf(":"));
		int userage = (Integer.parseInt(age))+1;
		System.out.println("2번문제 \n이름:" + user + "나이" + userage);
	}
	
	/*
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("이름:나이를 입력하세요");
		String userInput = scan.nextLine();
		System.out.println("====1번문제====");
		int idx = userString.indexOf(":");
		System.out.println(idx);
		System.out.println(userString.substring(0, idx));
		System.out.println(userString.substring*idx+1));
		
		String nm = userString.substring(0, idx);
		String age = userString.substring(idx+1);
		
		//계산식 필요시 숫자형으로 변경
		int userAge = Integer.parseInt(age);
		System.out.println("입력하신 이름은:" + nm + "나이는:"+ age);
		System.out.println("입력하신 이름은:" + nm + "나이는:"+ userAge);
	}
	*/
}
