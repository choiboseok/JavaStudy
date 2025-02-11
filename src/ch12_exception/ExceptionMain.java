package ch12_exception;

import java.text.ParseException;

public class ExceptionMain {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		int [] arr = {1,2,3};
		String str = null;
		try {
//			System.out.println(arr[3]);
			str.length();
		} catch(ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException - 예외 상황에 대해 정의해 놓은 클래스 / 특정 상황에 대해 잡아줌
			System.out.println("인덱스 문제");
		} catch(NullPointerException e) {
			System.out.println("널이다");
		} catch (Exception e) { //어떤 오류든 추적하겠다는 의미
//			System.out.println(e.toString());
			e.printStackTrace(); // 예외 발생 코드에 대해 추적한 내용 출력
		} finally { // 이후에 처리되어야 하는 로직이 있을시
			System.out.println("오류가 나도 안나도 여긴 처리됨");
		}
		
		//throws 메소드 호출하는 쪽에서 예외처리해야함, 해당부분에서 처리를 하라고 던져짐
		try {
			ExMethod.datemillSec("2025/01/01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// 예외처리가 되어있는 메소드
		ExMethod.datemillSec2("2025/01/01");

		// 사용자 정의 되어있는 예외처리 호출
		try {
			ExMethod.PrinterName("");
		} catch (BizException e) {
			System.out.println(e.getErrCode()); // BizException 클래스 메소드
			System.out.println(e.getMessage()); // 부모 메소드 (Exception에 정의되어 있는 함수)
			e.printStackTrace();
		}
		
		try {
			ExMethod.PrinterName("길");
		} catch (BizException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("메인 종료");
	}
}
