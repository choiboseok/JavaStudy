package ch09_class.typing;

import java.util.ArrayList;

public class Dictionary {
	
	public static final int OPTION_STUDENT = 0; //전역적 사용 상수, 보통 대문자
	public static final int OPTION_CODING_WORD = 1; //전역적 사용 상수, 보통 대문자
	public static final int OPTION_RANDOM = 2; //전역적 사용 상수, 보통 대문자
	
	//반환할 변수가 있는 리스트 만들시 리턴값부터 작성하기
	//단어 메소드
	public static ArrayList<String> makeWordList(int option)
	{
		ArrayList<String> result = new ArrayList<>();
		if(option==OPTION_STUDENT) {
			result.add("Kang jisuk");
			result.add("Kim dorae");
			result.add("Kim byungjun");
			result.add("Kim seoyeong");
			result.add("Kim soyeon");
			result.add("Kim wonjin");
			result.add("Park jeongdan");
			result.add("Park jonguk");
			result.add("Song eunho");
			result.add("Shin mijung");
			result.add("Lee yeseong");
			result.add("Lee yeeun");
			result.add("Jung jina");
			result.add("Choi boseok");
			result.add("Han sujeong");
		}else if(option==OPTION_CODING_WORD) {
			result.add("class");
			result.add("if");
			result.add("for");
			result.add("static");
			result.add("while");
			result.add("int");
			result.add("double");
			result.add("public");
			result.add("ArrayList");
		}else if(option==OPTION_RANDOM) {
			String[] alphabet = "abcdefghijklmnopqrstuvwxyz.".split("");
			for(int i=0; i<10; i++)
			{
				String word = "";
				for(int j=0; j<6; j++)
				{
					int idx = (int) (Math.random() * alphabet.length);
					word += alphabet[idx];
				}
				result.add(word);
			}
		}
		
		return result;
	}
	
}
