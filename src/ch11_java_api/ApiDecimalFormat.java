package ch11_java_api;

import java.text.DecimalFormat;

public class ApiDecimalFormat {
	public static void main(String[] args) {
		// 기본적인 소수점 포맷팅
		DecimalFormat df1 = new DecimalFormat("#.##");
		System.out.println("기본 소수점 포맷:" + df1.format(1234.56789));
		
		// 천 단위 구분 기호 추가
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		System.out.println("천 단위 구분:" + df2.format(1234567.8911));
		
		// 정수
		DecimalFormat df3 = new DecimalFormat("#");
		System.out.println("정수:" + df3.format(123.456));
		
		// 퍼센트 변화(입력값이 자동으로 100배 적용)
		DecimalFormat df4 = new DecimalFormat("#.##%");
		System.out.println("퍼센트 변환:" + df4.format(0.756));
		System.out.println("퍼센트 변환:" + df4.format(0.05));
		
		// 과학적 표기법
		DecimalFormat df5 = new DecimalFormat("0.###E0");
		System.out.println("과학적 표기법:" + df5.format(1234567.89)); // 0 6개를 곱한다는 뜻
		
		// 특정 단위와 결합
		DecimalFormat df6 = new DecimalFormat("#.##kg");
		System.out.println("단위 포함:" + df6.format(75.4));
		
	}
}
