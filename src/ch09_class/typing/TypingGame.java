package ch09_class.typing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TypingGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		if(args.length>0)
		{
			num = Integer.parseInt(args[0]);
		} else {
			num = Dictionary.OPTION_STUDENT; //0
		} 
		System.out.println("typing Game (0.name 1.coding 2.random)");
		System.out.println(num + "select");
		ArrayList<String> wordList = Dictionary.makeWordList(num); //static 이라서 호출 가능
		long before = System.currentTimeMillis(); //UTC기준 밀리초 
		int s=0; //맞춤
		int f=0; //틀림
		int cnt=0; //횟수
		// 1. 리스트 중 단어 랜덤 선택
		// 2. 입력 단어, 문제 단어가 일치하면 삭제 s 증가
		// 3. 틀리면 f 증가
		// 4. 게임 종료시 소요시간 출력
		while(true)
		{ 
			int idx = (int)(Math.random() * wordList.size());
			cnt++;
			System.out.println(wordList.get(idx));
			System.out.print("타자 입력:");
			String str = scan.nextLine();
			if(str.equals("종료"))
			{
				System.out.println(cnt-1 + "회 시도");
				System.out.println("s:" + s + " f:" + f);
				break;
			}
			if(str.equals(wordList.get(idx)))
			{
				wordList.remove(idx);
				s++;
			}
			else f++;
			
			if(cnt==wordList.size())
			{
				System.out.println(cnt + "회 시도");
				System.out.println("s:" + s + " f:" + f);
				break;
			}
		}
		long after = System.currentTimeMillis();
		long diff = after - before;
		double result = diff/1000.0;
		System.out.println(result + "초 걸리셨습니다.");
	}
}