package ch05_conditional;

import java.util.Iterator;

/**
 * class Name : LoopFor Author : BoSeok Created Date : 2025. 1. 24. Version :
 * 1.0 Purpose : [목적을 작성하세요] Description : 반복문 for
 */
public class LoopFor {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		int sum2 = 0;
		for (int i = 21; i <= 45; i++) {
			sum2 += i;
		}
		System.out.println(sum2);

		int sum3 = 0;
		for (int i = 1; i <= 40; i++) {
			if (i % 2 == 0)
				sum3 += i;
		}
		System.out.println(sum3);

		int dan = 9;
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d", dan, i, dan * i);
		}

		for (int dan2 = 2; dan2 <= 9; dan2++) {
			if (dan2 == 5)
				continue;
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan2, i, dan2 * i);
			}
		}

		int sum4 = 0;
		for (int i = 1; i < 1000; i++) {
			sum4 += i;
			if (sum4 >= 100) {
				System.out.println(i);
				break;
			}
		}

		int sum5 = 0;
		outer: for (int i = 2; i < 9; i++) {
			for (int j = 1; j <= 9; j++) {
				sum5 = i * j;
				System.out.printf("i:%d, j:%d, i*j:%d", i, j, sum5);
				if (sum5 >= 50)
					break outer; // outer는 main 반복문에서 탈출할때 사용
			}
		}

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		for (int i = 1; i <= 100; i+=5) {
			System.out.println(i);
		}
	}
}
