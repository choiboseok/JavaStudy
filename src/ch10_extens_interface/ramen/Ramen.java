package ch10_extens_interface.ramen;

//abstract 추상 클래스( 미완성 클래스로 자체적으로 객체 생성 불가)
/**
 * class Name 	: Ramen
 * Author	  	: BoSeok
 * Created Date : 2025. 2. 7.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: 추상클래스, 추상메소드 사용버
 */
public abstract class Ramen {
	String name;
	int price;
	public Ramen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public abstract void printRecipe(); //in, out, nm 정의
	
}
