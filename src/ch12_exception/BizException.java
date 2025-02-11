package ch12_exception;

/**
 * class Name 	: BizException
 * Author	  	: BoSeok
 * Created Date : 2025. 2. 11.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: 사용자 정의 예외처리 클래스
 */
public class BizException extends Exception{
	private String errCode = "";

	public BizException() {
	}
	
	public BizException(String errCode) {
		super();
		this.errCode = errCode;
	}
	
	public BizException(String errCode, String errMsg) {
		super(errMsg); // Exception(부모함수)에 정의되어 있는 함수
		this.errCode = errCode;
	}

	public String getErrCode() {
		return errCode;
	}
}
