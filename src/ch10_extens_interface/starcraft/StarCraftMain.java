package ch10_extens_interface.starcraft;

import java.util.ArrayList;

public class StarCraftMain {
	public static void main(String[] args) {
		Marine marine1 = new Marine();
		Marine marine2 = new Marine("영웅마린", 8, 100, 0);
		Zealot zealot = new Zealot();
		System.out.println(marine1);
		System.out.println(marine2);
		
		marine2.move(100, 200);
		marine2.stimpack();
		System.out.println(marine2);
		
		/* 다형성(Polymorphism)
		 * 객체 지향 프로그래밍(OOP)의 핵심 개념 중 하나로
		 * 같은 인터페이스 or 부모 클래스를 공유하는 객체들이 서로 다른 방식으로 
		 * 동작 할 수 있는 특성
		 * 오버라이딩, 오버로딩, 업캐스팅, 다운캐스팅..
		 * 장점: 코드 재사용성, 유지보수 용이, 확장성 높음
		 * */
		
		StarUnit highTemplar1 = new HighTemplar();
		HighTemplar highTemplar2 = new HighTemplar();
		StarUnit highTemplar3 = highTemplar2; //자식에서 부모 객체로 형변환
		System.out.println(highTemplar1);
		System.out.println(highTemplar2);
		System.out.println(highTemplar3);
		highTemplar2.tthunderStorm();
//		highTemplar1.tthunderStorm(); 타입이 부모타입이기 때문에 자식이 가지고 있는 메소드 사용 불가
		//다운캐스팅
		((HighTemplar)highTemplar1).tthunderStorm(); // ex)parseInt
		//같은 부모 타입이기 때문에 하나의 배열에 같은 인스턴스들이 들어갈 수 있음
		ArrayList<StarUnit> starList = new ArrayList<>();
		starList.add(marine1);
		starList.add(marine2);
		starList.add(highTemplar1);
		starList.add(highTemplar2);
		for(int i=0; i<starList.size(); i++)
		{
			starList.get(i).move(100, 150);
		}
		marine2.attack(highTemplar1);
		System.out.println(highTemplar1);
		
		//형병환 가능 체크
		StarUnit scv = new StarUnit("SCV", 5, 60, 0);
		System.out.println(scv instanceof Zealot);//부모 객체는 자식객체로 형변환 할 수 없음
		StarUnit m = marine1; // 자식 - 부모 - 자식(가능)
		System.out.println(m instanceof Marine); //부모 객체로 형변환 되었던 자식 객체는 가능
		
	}
}