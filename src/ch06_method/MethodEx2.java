package ch06_method;

import java.util.Scanner;

public class MethodEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("고객수를 입력해주세요:");
		int num = scan.nextInt();
		
		coffee(num);
		// coffeeShop(num);
		scan.close();
	}
	/*
	public static void coffeeShop(int num) {
		System.out.println(num + "명 고객 입장.");
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while(num > i)
		{
			System.out.printf("%d번쨰 고객님 어떤걸 드릴까요?", (i+1));
			int price = 0;
			String order = scan.nextLine();
			switch(order) {
			case "아아":
				price = 3000;
				break;
			}
			if(price > 0) {
				System.out.println("선택한 음료는 " + price + "원 입니다.");
				i++;
			}
		}
	}
	*/
	public static void coffee(int num) {
		Scanner scan = new Scanner(System.in);

		int price = 0;
		
		for(int i = 1; i <= num; i++)
		{
			System.out.printf("%d번째 고객님 어떤걸 드릴까요?", i);
			String menu = scan.nextLine();
			
			while(num>=i)
			{
				if(menu.equals("아메리카노") || menu.equals("아아")){
					price += 3000;
					System.out.println("가격은 3000원 입니다.");
					break;
				}else if(menu.equals("카푸치노")) {
					price += 4500;
					System.out.println("가격은 4500원 입니다.");
					break;
				}else if(menu.equals("밀크티")) {
					price += 5000;
					System.out.println("가격은 5000원 입니다.");
					break;
				}else 
					System.out.println("메뉴가 없습니다. 다시 입력 해주세요");
					i--;
					break;
			}
		}
		System.out.println("주문이 완료되었습니다.");
		System.out.println("총 금액은 "+ price + "원 입니다.");
		scan.close();
		
	}
}
