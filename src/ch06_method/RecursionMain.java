package ch06_method;

/**
 * class Name : RecursionMain Author : BoSeok Created Date : 2025. 1. 31.
 * Version : 1.0 Purpose : [목적을 작성하세요] Description : 재귀함수
 */
public class RecursionMain {
	public static void main(String[] args) {
		System.out.println(recFactorial(3));
		Func(10); // 무한루프 예시
	}

	public static long recFactorial(int num) {
		if (num == 1) {
			return 1;
		}
		return num * recFactorial(num - 1);
	}

	public static void Func(int num) {
		if (num == 0)

		{
			return;
		} else {
			System.out.println("hi");
			Func(num - 1);
		}
	}
}
