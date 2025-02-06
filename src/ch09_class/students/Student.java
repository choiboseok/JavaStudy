package ch09_class.students;

import ch09_class.util.UtilClass;

/**
 * class Name 	: Student
 * Author	  	: BoSeok
 * Created Date : 2025. 2. 5.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: class 기초
 */
public class Student {
	//1.필드
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	public Student(String name) {
		this.name = name;
		save();
	}
	//Field 생성자 오버로딩 , 객체를 다양하게 만들 수 있음.
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setAvg();
	}
	
	//super
	public Student() {}

	@Override
	//toString 부모의 기능을 재정의하는 기능
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}
	
	//setter, getter
	public String getName() {return name;}
	public void setName(String name) { this.name = name;}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;setAvg();}
	public int getEng() {return eng;}
	public void setEng(int eng) {
		this.eng = eng;
		setAvg();
	}
	public double getAvg() {return avg;}
	public void setAvg(double avg) {this.avg = avg;}
	public int getMath() {return math;}
	public void setMath(int math) {
		this.math = math;
		setAvg();
	}
	private void setAvg() {
		this.avg = UtilClass.weRound((kor+eng+math) / 3.0, 2);
		//this - 인스턴스화가 된 후에 변수
	}
	
	public void nm() { System.out.println(name + "입니다."); }
	private void save() { System.out.println(name + "등록됨"); }
	public static void check() { System.out.println("student의 static method 클래스명.check로 호출가능");}
	
	
	
}
