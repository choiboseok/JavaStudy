package ch10_extens_interface.papacar;

public class ElectricCar implements Vehicle {
	@Override
	public void start() {
		System.out.println("슈우우ㅇ~~");
	}
	@Override
	public void stop() {
		System.out.println("---");
	}
}