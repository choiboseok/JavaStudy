package practice;

import java.util.Scanner;

public class Result01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Q.01
		System.out.print("국어 점수를 입력해주세요:");
		int kor = scan.nextInt();
		System.out.print("영어 점수를 입력해주세요:");
		int eng = scan.nextInt();
		System.out.print("수학 점수를 입력해주세요:");
		int mat = scan.nextInt();

		double avg = (double)(kor + eng + mat) / 3;
		System.out.println("평균 : " + avg);       

		if (avg >= 90)
			System.out.println("등급 : A등급");
		else if (avg >= 80)
			System.out.println("등급 : B등급");
		else if (avg >= 70)
			System.out.println("등급 : C등급");
		else
			System.out.println("등급 : D등급");
		
		// Q.02
		int sum = 1;
		long sum1 = 1;
		for (int i = 1; i <= 10; i++) {
			sum *= i;
		}
		System.out.println("10팩토리얼 \n" + "결과 : " + sum);
		
		for (int j = 1; j <= 15; j++) {
			sum1 *= j;
		}
		System.out.println("15팩토리얼 \n" + "결과 : " + sum1);
	}
}
