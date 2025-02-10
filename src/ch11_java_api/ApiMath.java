package ch11_java_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * class Name 	: ApiMath
 * Author	  	: BoSeok
 * Created Date : 2025. 2. 10.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: 자바에 있는 기본 API
 */
public class ApiMath {
	public static void main(String[] args) {
		final double PI = 3.14;
		//round 반올림, ceil 올림, floor 내림
		long roundPI = Math.round(PI);
		System.out.println(roundPI);
		double fourPI = (Math.round(PI * 1000)) / 1000.0;
		System.out.println(fourPI);
		double ceilPI = Math.ceil(PI);
		System.out.println(ceilPI);
		int random = (int) ((Math.random() * 11) + 2);
		System.out.println(random);
		//제곱근
		System.out.println(Math.sqrt(4));
		
		ArrayList<String> classMate = new ArrayList<>(Arrays.asList("강지석", "김도래", "김병준", "김서영", "김소연", "김원진", "박정단", 
	              										"박종욱", "송은호", "신미정", "이예성", "이예은", "정지나", "최보석", "한수정"));
		HashMap<String, String> result = randomGame(classMate);
		Set<String> keySet = result.keySet();
		for(String nm: keySet)
		{
			System.out.println(nm + "님은" + result.get(nm));
		}
	}
	
	// 확률카드 메소드
	public static String randomCard()
	{
		String result = "꽝!";
		Random random = new Random();
		int num = random.nextInt(100) + 1;
		if(num <= 10)
		{
			result = "당첨";
		}
		return result;
	}
	
	public static HashMap<String, String> randomGame(ArrayList<String> arr)
	{
		HashMap<String, String> resultMap = new HashMap<>();
		for(int i=0; i<arr.size(); i++)
		{
		resultMap.put(arr.get(i), randomCard());
		}
		return resultMap;
	}
}
