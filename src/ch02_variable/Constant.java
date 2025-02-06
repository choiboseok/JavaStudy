package ch02_variable;
// Shift + Alt + j
/**
 * class Name 	: Constant
 * Author	  	: BoSeok
 * Created Date : 2025. 1. 22.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: [설명을 작성하세요]
 */
public class Constant 
{
	public static void main(String[] args) 
	{
		// 상수
		final double MATH_PI = 3.14;
		// MATH_PI = 1;

		double math_pi = 3.14;
		math_pi = 1;
		
		String fruits = "Apple, Banana, Cherry";
		System.out.println(fruits.length());
		String trimFruits = fruits.trim();
		System.out.println(trimFruits.length());
		
		System.out.println(trimFruits.indexOf("Banana"));
		System.out.println(trimFruits.indexOf("바나나"));
		
		System.out.println(trimFruits.substring(15));
		System.out.println(trimFruits.substring(7, 13));
		
		String pangsu = "팽수:10";
		System.out.println("이름:" + pangsu.substring(0,2));
		System.out.println("나이:" + pangsu.substring(3));
		
		String stu = "김길동:20";
		String stu2 = "남궁민수:30	";
		System.out.println(stu2.substring(0, stu2.indexOf(":")));
		System.out.println(stu2.substring(stu2.indexOf(":")));
	}
}
