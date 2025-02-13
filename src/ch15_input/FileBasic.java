package ch15_input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * 파일 입출력(문자단위)
 */
/**
 * class Name : FileBasic Author : 202-22 Created Date : 2025-02-13 Version :
 * 1.0 Purpose : [목적을 작성하세요] Description : 파일 입출력(문자단위)
 */
public class FileBasic {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		// 현재 경로
		System.out.println(path);
		FileReader reader = null;
		FileWriter writer = null;

		// 파일을 문자단위로 읽기 위한
		try {
			reader = new FileReader(path + "/delay.txt"); // 읽기
			writer = new FileWriter(path + "/delay_backup.txt"); // 쓰기
			char[] data = new char[16]; // 한번에 16개 문자를 읽겠다.(기준없음), 보내는쪽 받는쪽은 서로 맞아야 한다.
			while (true) {
				int x = reader.read(data);
				if (x == -1) {
					System.out.println("파일 끝에 도달");
					break;
				}
				writer.write(data, 0, x); // data 배열의 0번째 인덱스부터 x 만큼 파일에 쓰겠다.
			}
			writer.flush(); // 남아 있는게 없도록 비움.
			System.out.println("파일 쓰기 완료.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) writer.close();
				if (reader != null) reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
