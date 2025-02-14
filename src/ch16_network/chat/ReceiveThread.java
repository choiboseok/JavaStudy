package ch16_network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ReceiveThread extends Thread{  // 받는 용 클래스 , 스레드이기 때문에 보내고 받는 과정을 병렬적으로 수행
	private Socket soc;

	public ReceiveThread(Socket soc) {
		this.soc = soc;
	}

	@Override
	public void run() {
		// 전달 받은 내용을 콘솔에 출력
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream(), "UTF-8"));
			while(true) {
				String msg = reader.readLine();
				if(msg == null || msg.equals("")) {
					break;
				}
				System.out.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(soc != null) soc.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	
}
