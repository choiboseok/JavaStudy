package ch12_exception;

import java.util.*;

import javax.print.attribute.standard.PrinterName;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ExMethod {
	
	public static long datemillSec(String date) throws ParseException{ // 너가 오류 처리를 해라 (던지기)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp = sdf.parse(date);
		return temp.getTime();
	}

	public static long datemillSec2(String date) { // try, catch로 직접 처리
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp;
		Long result = 0L;
		try {
			temp = sdf.parse(date);
			result = temp.getTime();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void PrinterName(String nm) throws BizException {
		// 컴파일, 런타임 오류는 아니지만
		// 우리 업무에서는 오류로 보는 상황에 대한 예외처리 방법
		if(nm.length() == 0) {
			// 오류를 발생 시켜서 전달
			throw new BizException("001", "이름에 empty가 들어옴");
		}else if(nm.length() == 1){
			throw new BizException("002", "외자는 안됨");
		}
	}
}
