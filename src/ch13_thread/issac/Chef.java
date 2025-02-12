package ch13_thread.issac;

public class Chef extends Thread{
	
	private Issac issac = Issac.getInstance();
	private int count;
	public EndCook endCook;
	
	public Chef(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		for(int i=0; i<count; i++) {
			try {
				Thread.sleep(1000); // 1초에 1개씩 생산
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			issac.makeToast();
		}
		endCook.endOfCook(); // 인터페이스의 메서드 호출, 사용하는 곳마다 새롭게 재정의 해서 사용할 수 있음. 
	}
}
