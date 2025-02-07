package ch10_extens_interface.family;
/**
 * class Name 	: Parent
 * Author	  	: BoSeok
 * Created Date : 2025. 2. 7.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: 상속 기본 방법
 */
public class Parent {
	private String name;
	private int age;
	public Parent() {super();} //기본적으로 클래스들은 오브젝트를 상속 받는다.
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//오버라이딩 (부모의 메서드를 재정의(override)해서 사용)
	//부모에게는 toString()이라는 동일한 메서드가 있음. 하지만 재정의해서 다르게 사용 가능
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}
	public void sayHello()
	{
		System.out.println("부모 입니다. 소리 질러");
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
}
