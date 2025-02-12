package ch13_thread;

/**
 * class Name 	: ExRunnable
 * Author	  	: BoSeok
 * Created Date : 2025. 2. 12.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: 스레드 사용법 Runnable 인터페이스 구현
 */
public class ExRunnable implements Runnable {
	int num;
	String name;
	public ExRunnable(int num, String name) {
		this.name = name;
		this.num = num;
	}
	
	@Override
	public void run() {
		for(int i=num; i<=num+5; i++) {
			System.out.println(name + " " + i);
			//시간차를 두기 위해
			try {
				Thread.sleep(500); //0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	
}
