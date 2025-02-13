package ch15_input;

import java.io.File;

/**
 * class Name 	: FileDir
 * Author	  	: 202-22
 * Created Date : 2025.02.13
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: File 폴더 다루기
 */
public class FileDir {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		String baseDirPath = path + "\\classMate";
		File baseDir = new File(baseDirPath); // 파일명
		if(!baseDir.exists()) { // 디렉토리 체크
			baseDir.mkdir(); // 기본 디렉토리가 없으면 생성
		}
		
		// 삭제
		if(baseDir.exists() && baseDir.isDirectory()) { //isDir, isFile = 폴더인지 파일인지 체크항는 메소드
			if(baseDir.delete()) {
				System.out.println("폴더가 삭제되었습니다.");
			} else {
				System.out.println("실패");
			}
		} else {
			System.out.println("폴더가 존재하지 않음");
		}
	}
}
