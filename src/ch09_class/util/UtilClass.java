package ch09_class.util;

/**
 * class Name 	: UtilClass
 * Author	  	: BoSeok
 * Created Date : 2025. 2. 5.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: static 메서드
 */
public class UtilClass {
	//public static 정적 메서드, 공통기능과 같은 부분을 정의해서 사용
	
	public static double weRound(double num, int n) // 반올림 하고자 하는 소수, 소수 n번째 자리까지
	{
		int ten = 1;
		for(int i=0; i<n; i++)
		{
			ten*=10; 
		}
		num *= ten;   
		long temp = Math.round(num);
		double result = (double) temp/ten;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(weRound(75.59786945614, 3));
	}
}
