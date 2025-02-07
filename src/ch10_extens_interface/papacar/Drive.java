package ch10_extens_interface.papacar;

import java.util.ArrayList;
import java.util.List;
//인터페이스를 사용하여 메소드 반복 작업 해결?
public class Drive {
	public static void main(String[] args) {
		Vehicle car1 = new ElectricCar();
		Vehicle car2 = new GasCar();
		// 제네릭이 같은 타입으로 사용 가능
		car1.start();
		car2.start();
		
		ArrayList<Vehicle> cars = new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		System.out.println(cars);
		
		// 동일한 리스트를 사용
		List list1 = new ArrayList<>();
		List list2 = new ArrayList<>();
		list1.add("hi");
		list2.add("hiiii");
	}
}