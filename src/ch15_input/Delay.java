package ch15_input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * class Name : Delay Author : 202-22 Created Date : 2025.02.13 Version : 1.0
 * Purpose : [목적을 작성하세요] Description : [설명을 작성하세요]
 */
public class Delay {
	public static void main(String[] args) {
		// 지각자 작성 프로그램
		Scanner sc = new Scanner(System.in);
		// 날짜
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String currentDate = sdf.format(new Date());
		String filePath = "delay.txt"; //
		File file = new File(filePath); // 디폴트 현재위치 workspace
		FileOutputStream fos = null; // fos를 닫기위해서 밖에 선언
		try {
			fos = new FileOutputStream(file, true);
			fos.write((currentDate + "오늘의 지각자\n").getBytes());
			while (true) {
				System.out.println("오늘의 지각자를 기록하세요(exit를 입력하면 종료)");
				String msg = sc.nextLine();
				if ("exit".equalsIgnoreCase(msg)) {
					System.out.println("종료합니다.");
					break;
				}
				fos.write((msg + "\n").getBytes());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
