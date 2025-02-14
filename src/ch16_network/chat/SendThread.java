package ch16_network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread{  // 전송용 클래스
	private Socket soc;
	private String name;
	
	public SendThread(Socket soc, String name) {
		super();
		this.soc = soc;
		this.name = name;
	}

	@Override
	public void run() { // 스트리밍 환경을 계속 전송
		// 키보드 입력을 소켓에 데이터로 전송사용
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // 글을 읽어들이는 부분 
		try {
			PrintWriter writer = new PrintWriter(soc.getOutputStream());
			// 닉네임 전송
			writer.println(name);
			writer.flush();
			while(true) {
				System.out.println("입력:");
				String msg = reader.readLine();
				if(msg == null || msg.equals("")) { // 채팅방 입력 효과
					break;
				}
				writer.println(name + ":" + msg);
				writer.flush(); // writer 후에 비우는 함수
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(soc != null)  soc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
