package ch13_thread.issac;

public class IssacMain {
	public static void main(String[] args) throws InterruptedException {
		// 오픈전
		Customer cust1 = new Customer("팽수", 3);
		Customer cust2 = new Customer("동길", 5);
		cust1.start();
		cust2.start();
		Thread.sleep(1000);
		System.out.println("오픈");
		Issac.getInstance().orderCheck(); // Queue 자료구조 형태이기 때문에 먼저 들어온 주문이 먼저 출력됨
		
		Chef chef1 = new Chef(5);
		chef1.start();
		chef1.endCook = new EndCook() {
			@Override
			public void endOfCook() {
				System.out.println("토스트 완성");
			}
		};
		
		Chef chef2 = new Chef(6);
		chef2.endCook = new EndCook() {
			@Override
			public void endOfCook() {
				System.out.println("금방이구만 토스트완성");
			}
		};
		chef2.start();
	}
}
