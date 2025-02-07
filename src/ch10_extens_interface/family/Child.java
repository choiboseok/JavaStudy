package ch10_extens_interface.family;

//extends 상속받을 때 사용
public class Child extends Parent{
	public Child() {super();} 
	public Child(String name, int age) {
		super(name, age);
	}
	@Override
	public void sayHello() { //override importMethod
		System.out.println("자식 입니다.");
	}
	@Override
	public String toString() {
		return "Child [toString()=" + super.toString() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}