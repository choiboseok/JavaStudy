package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("어떤걸로 드릴까요?");
		String input = scan.nextLine();
		int price = 0;
		
		switch(input)
		{
			case "아메리카노", "아아" :
				price = 3000;
				System.out.printf("가격은 %d 입니다.\n", price);
				break;
			case "카푸치노" :
				price = 4500;
				System.out.printf("가격은 %d 입니다.\n", price);
				break;
			case "밀크티" :
				price = 5000;
				System.out.printf("가격은 %d 입니다.\n", price);
				break;
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
		}
		scan.close();
	}
}
