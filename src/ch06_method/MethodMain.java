package ch06_method;

import java.util.Scanner;

/**
 * class Name 	: MethodMain
 * Author	  	: BoSeok
 * Created Date : 2025. 1. 31.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: java의 함수(클래스에 종속되어 있는 method)
 */
public class MethodMain {
	//void라 리턴이 없으며 매개변수 한개 String []배열타입
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		printSum(1, 100); // 반복 작업을 위해 메소드 사용
		System.out.println(returnSum(1, 50));
		int result = returnSum(2, 4);
		System.out.println(result);
		print("프린트 메소드");
		print(123);
		print(123.99);
		*/
		System.out.println(factorial(15));
	}
	/*
	public static void printSum(int from, int to) {
		int sum = 0;
		for(int i = from; i <= to; i++)
		{
			sum += i;
		}
		System.out.printf("from: %d 부터 to: %d 까지 합은: %d", from, to, sum);
	}
	
	public static int returnSum(int from, int to) {
		int sum = 0;
		for(int i = from; i <= to; i++)
		{
			sum += i;
		}
		return sum;
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	public static void print(int msg) {
		System.out.println(msg);
	}
	
	public static void print(double msg) {
		System.out.println(msg);
	}
	*/
	public static long factorial(int num) {
		
		long sum = 1;
		for (int j = 1; j <= num; j++) {
			sum *= j;
		}
		return sum;
	}
}
