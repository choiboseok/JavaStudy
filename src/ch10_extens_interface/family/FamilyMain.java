package ch10_extens_interface.family;

public class FamilyMain {
	public static void main(String[] args) {
		//슈퍼클래스(부모)
		//서브클래스(자식) 서브클래스는 슈퍼클래스의 모든 필드와 메소드를 상속받음
		Parent papa = new Parent("부모", 60);
		System.out.println(papa.toString());
		papa.sayHello();
		
		Child baby = new Child(); //부모의 기능을 상속 받아서 사용 가능
		baby.setName("아기");
		baby.setAge(5);
		baby.sayHello();
		System.out.println(baby.toString());
	}
}
