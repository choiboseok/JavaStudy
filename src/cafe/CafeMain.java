package cafe;

import java.util.ArrayList;
import java.util.Scanner;

import bank.Account;

public class CafeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sel;
		
		ArrayList<Coffee> menu = new ArrayList<>();
		Cafe cafe = new Cafe();
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 스타벅스 방문 | 2. 아카 방문 | 3. 사무실 복귀");
			System.out.print(">>>");
			sel = sc.nextInt();
			
			if(sel == 1) {
				String store = "스타벅스";
				cafe.showMenu(store);
				
			} else if(sel == 2) {
				String store = "아카";
				cafe.showMenu(store);
				
			} else if(sel == 3){
				System.out.println("사무실로 복귀");
				break;
			} else { System.out.println("다시입력"); }
		}
	}
}
