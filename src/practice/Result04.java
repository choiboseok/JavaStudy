package practice;

import java.util.Scanner;

public class Result04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int A = (int) ((Math.random()*20 )+1);
			int B = (int) ((Math.random()*20 )+1);
			System.out.println("==============엘리베이터==============");
			System.out.println("승강기 A의 현재 위치: " + A);
			System.out.println("승강기 B의 현재 위치: " + B);
			System.out.print("몇층에 계시나요? [종료는 q 또는 exit]: ");
			String floor = scan.nextLine();
			
			if(floor.equals("ㅃ")|| floor.equals("ㅂ") ||floor.equals("q") || floor.equals("Q") || floor.equals("exit") 
					|| floor.equals("Exit") || floor.equals("EXIT") || floor.equals("ㄷ턋") || floor.equals("ㄸ턌")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			movefloor(floor, A, B);
		}
	}
	public static void movefloor(String floor, int a, int b) {
		int input=Integer.parseInt(floor);;
		
		if(Math.abs(input-a) > (Math.abs(input-b))) {
			System.out.println("엘리베이터 B가 " + floor + "층으로 이동하였습니다.");
		} else if(Math.abs(input-a) < (Math.abs(input-b))){
			System.out.println("엘리베이터 A가 " + floor + "층으로 이동하였습니다.");
		} else if(Math.abs(input-a) == (Math.abs(input-b))) {
			if(a>b)	System.out.println("엘리베이터 A가 " + floor + "층으로 이동하였습니다.");
			else if(b>a) System.out.println("엘리베이터 B가 " + floor + "층으로 이동하였습니다.");
		}
	}
}
