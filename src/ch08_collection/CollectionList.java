package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * class Name 	: CollectionList
 * Author	  	: BoSeok
 * Created Date : 2025. 2. 4.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: ArrayList
 */
public class CollectionList {
	public static void main(String[] args) {
		/*
		 *  1. List : 중복 허용, 인덱스 사용
		 *  2. Map  : key, value 로 구성, key는 중복 x
		 *  3. Set  : 중복 허용x, 순서 보장x
		 * */
		
		ArrayList<String> students = new ArrayList<>(); //자유로운 크기
		students.add("팽수");
		students.add("길동");
		students.add("동길");
		System.out.println(students);
		System.out.println(students.get(1));
		students.set(1, "팽순");
		System.out.println(students);
		System.out.println(students.size());
		System.out.println(students.isEmpty()); //비어 있는지 확인
		students.remove("동길");
		students.clear();
		System.out.println(students.isEmpty());
		System.out.println(students);
		
		students.add("강지석");
		students.add("김도래");
		students.add("김병준");
		students.add("김서영");
		students.add("김소연");
		students.add("김원진");
		students.add("박정단");
		students.add("박종욱");
		students.add("송은호");
		students.add("신미정");
		students.add("이예성");
		students.add("이예은");
		students.add("정지나");
		students.add("최보석");
		students.add("한수정");
		
		for(int i=0; i<students.size(); i++)
		{
			System.out.printf(students.get(i));
		}
		System.out.println();
		System.out.println("==========================");
		for(String str: students) //value값만 추출
		{
			System.out.printf(str);
		}
		
		ArrayList<String> stu = students; //얇은 복사, 주소를 복사(공유)한다.
		stu.set(0, "지석");
		System.out.println(students);
		System.out.println(stu); 
		
		ArrayList<String> stu2 = new ArrayList<>(students); //깊은 복사
		ArrayList<String> stu3 = new ArrayList<>(); //깊은 복사2
		stu3.addAll(students);
		stu2.set(0, "Kang Ji Seok");
		stu3.set(0, "Ji Seok");
		System.out.println(students);
		System.out.println(stu2);
		System.out.println(stu3);
		
		Collections.sort(stu3); //오름차순
		System.out.println(stu3);
		
		Collections.sort(stu3, Comparator.reverseOrder()); //내림차순
		System.out.println(stu3);
		
		// 정수형 선언
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 11, 54, 84, 23, 112, 1));
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		for(int num : numbers)
		{
			System.out.println(num);
		}
		
		
	}
}
