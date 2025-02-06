package ch05_conditional;

/**
 * class Name 	: ConditionalMain
 * Author	  	: BoSeok
 * Created Date : 2025. 1. 23.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: 조건문 만약에
 */
public class ConditionalMain 
{
	public static void main(String[] args)
	{
		int score = 85;
		String grade = "";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else {
			grade = "C";
		}
		System.out.println(score + "는" + grade);
		
		int price = 3000;
		int myMoney = 1000;
		if(price > myMoney)
		{
			System.out.println("돈이 부족합니다...");
		} else {
			System.out.println("돈이 충분합니다.");
		}
		
		String nm = "닉";
		String phone = "01012344321";
		if(nm.length() >= 1)
		{
			if(phone.length() >= 10 || phone.length() < 11)
			{
				System.out.println("가입 가능합니다.");
			} else System.out.println("가입 실패입니다.");
		} else System.out.println("가입 실패입니다.");
	}
}
