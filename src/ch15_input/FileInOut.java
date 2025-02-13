package ch15_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  
 */
/**
 * class Name 	: FileInOut
 * Author	  	: 202-22
 * Created Date : ${date]
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: 파일 바이트 In Out
 */
public class FileInOut {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		String fileNm = "delay.txt";
		System.out.println(path + System.lineSeparator() + fileNm);
		File textFile = new File(path + "\\" + fileNm); // System.lineSeparator() <-- / or \\
		try {
			FileOutputStream fos = new FileOutputStream(textFile, false); // true는 파일이 있으면 append, false는 다시씀
			fos.write("팽수 늦음\n".getBytes()); //getBytes - 문자열을 바이트로 변경
			fos.write("동길 늦음\n".getBytes()); // input, outputStream 은 1byte 처리함
			fos.close(); // input outputStream 을 사용시에 close는 필수
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일 읽기
		try {
			FileInputStream fis = new FileInputStream(textFile); 
			byte[] data = new byte[fis.available()]; // 파일을 바이트 단위로 가져오기
			while(true) {
				int x = fis.read(data); // 바이트단위로 가져온걸 읽는 부분
				if(x==-1) { // 파일을 끝까지 읽었다는 뜻 = -1
					break;
				}
				String result = new String(data); // byte배열을 String으로 변환
				System.out.println(result);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
