package ch13_thread.issac;

import java.util.LinkedList;
import java.util.Queue; 

public class Issac {
	
	private int toast = 0; // 공유
	private final Queue<String> orderList = new LinkedList<>(); // FIFO 자료구조
	
	private Issac() {
		
	}
	
	// 싱글톤 적용
	private static Issac instance = new Issac();
	
	public static Issac getInstance() {
		return instance;
	}
	
	// 토스트 만들기 (chef 클래스가 사용)
	// 멀티 스레딩 환경에서 여러 스레드가 동시에 같은객체나 메서드로 접근하는 것을
	// 방지하기 위해서 synchronized (동기화 유지 시켜줘야함)
	public synchronized void makeToast() {
		toast += 1;
		System.out.println("토스트를 1개 만들었습니다. 재고:" + toast);
		notifyAll(); // 대기중(wait)인 모든 스레드를 꺠운다.
	}
	
	//토스트 구매(customer 클래스가 사용)
	public synchronized void buyToast(String name, int count) {
		orderList.add(name);
		// peek은 처음이 뭔지 
		while(orderList.peek() != name || toast < count) { // 토스트가 만들어질때까지 계속 wait를 한다.
			try {
				wait();// 현재 주문이 맨 처음이 아니거나, 토스트가 충분하지 않으면 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		// 토스트가 만들어지면 반복문을 빠져나와 고객에게 토스트 판매
		toast -= count;
		System.out.println(name + "에게 토스트를" + count + "개 팔았습니다.");
		orderList.remove(); // 큐는 처음께 삭제됨
		notifyAll();  // 다음 대기중인 주문 처리를 위해 모든 스레드를 깨움.
	}
	
	public void orderCheck() { // Queue에 어떻게 담겨있는 확인하기 위한 메소드
		System.out.println(orderList.toString());
	}
}
