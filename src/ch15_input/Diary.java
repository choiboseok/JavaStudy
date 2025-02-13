package ch15_input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Diary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("오늘의 기록(exit 입력시 종료)");
			String msg = sc.nextLine();
			if ("exit".equalsIgnoreCase(msg)) {
				System.out.println("종료합니다.");
				break;
			}
			myDiary(msg);
		}
	}
	// input : string 내용
	// output : void
	// 내용을 입력으로 받아서 해당 날짜의 20250213.txt 파일에 내용이 기록되는 메소드 작성
	// 단 동일한 날짜라면 개행되고(\n) append 되도록
	// 폴더는 워크스페이스 아래 diary 폴더에, 없다면 생성
	public static void myDiary(String msg) {
		String path = System.getProperty("user.dir"); //현재 디렉토리 경로
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 형식
		String baseDirPath = path + "\\diary"; // 파일이 생성될 하위 디렉토리
		File baseDir = new File(baseDirPath);
		
		if(!baseDir.exists()) { // 디렉토리 체크
			baseDir.mkdir(); // 기본 디렉토리가 없으면 생성
		}
		
		String fileNm = sdf.format(new Date()); //날짜 파일 생성
		File file = new File(baseDirPath + "\\" + fileNm + ".txt"); 
		FileOutputStream fos = null; // fos를 닫기위해서 밖에 선언
		
		try {
			fos = new FileOutputStream(file, true); 
			fos.write(("\n" + msg).getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
