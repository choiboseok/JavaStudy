package bank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BankApplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Account> account = new ArrayList<>();
		while (true) {
			System.out.println("업무를 선택하세요");
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("-------------------------------------------");
			System.out.print("선택>");
			int sel = scan.nextInt();
			if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}

			// 계좌 생성
			if (sel == 1) {
				Account acc = new Account();
				System.out.println("------------");
				System.out.println("게좌생성");
				System.out.println("------------");
				System.out.print("계좌번호:");
				acc.number = scan.next();
				System.out.print("계좌주:");
				acc.name = scan.next();
				System.out.print("초기입금액:");
				acc.money = scan.next();
				
				account.add(acc);
//				account.add(acc.number + "  " + acc.name + "  " + acc.money);
				System.out.println("결과: 계좌가 생성되었습니다.");
			}
			// 계좌 목록
			if (sel == 2) {
				Account acc = new Account();
				System.out.println("------------");
				System.out.println("게좌목록");
				System.out.println("------------");
				for(int i=0; i<account.size(); i++) {
					
				}
			}
			// 예금
			if (sel == 3) {
				Account acc = new Account();
				System.out.println("------------");
				System.out.println("예금");
				System.out.println("------------");
				System.out.print("계좌번호:");
				acc.number = scan.next();
				System.out.print("예금액:");
				acc.money = scan.next();
				for(int i=0; i<account.size(); i++) {
					if(account.get(i).equals("")) {
						
					}
				}
			}
			// 출금
			if (sel == 4) {
				Account acc = new Account();
				System.out.println("------------");
				System.out.println("출금");
				System.out.println("------------");
				System.out.print("계좌번호:");
				acc.number = scan.next();
				System.out.print("출금액:");
				acc.money = scan.next();
			}
		}
	}
}
