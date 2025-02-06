package ch06_method;

import java.util.Scanner;

public class MethodEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요:");
		String name = scan.nextLine();
		System.out.print("국어 점수를 입력해주세요:");
		int kor = scan.nextInt();
		System.out.print("영어 점수를 입력해주세요:");
		int eng = scan.nextInt();
		System.out.print("수학 점수를 입력해주세요:");
		int mat = scan.nextInt();
		
		makeCard(name, kor, eng, mat);
	}
	
	public static void makeCard(String name, int kor, int eng, int mat) {
		
		String grade;
		double avg = (double)(kor + eng + mat) / 3; 
		if (avg >= 90)
			grade = "A";
		else if (avg >= 80)
			grade = "B";
		else 
			grade = "C";
		
		System.out.println(name + "님의 평균은 " + avg + "으로 " + grade + " 등급 입니다.");
		System.out.printf("%s님의 평균은 %.2f으로 %s 등급 입니다.", name, avg, grade);
	}
}
