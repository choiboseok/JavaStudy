package ch02_variable;

public class Casting 
{
	public static void main(String[] args) 
	{
		// 작 큰
		int a = 10;
		double b = a;
		
		//큰 작
		double c = 10.5;
		int d = (int) c;
		
		int num = 123;
		String str = String.valueOf(num);
		System.out.println(num);
		
		String str2 = "123";
		int num2 = Integer.parseInt(str2);
		System.out.println(num2);
	}
}