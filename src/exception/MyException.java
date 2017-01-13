package exception;

public class MyException extends Exception {
	private static final long serialVersionUID = -1745107701877498092L;

	//기본 예외 메세지
	public MyException(){
		super( "테스트 예외입니다." );
	}
	
	//메세지를 세팅해야 하는 경우
	public MyException( String message ) {
		super( message );
	}
}
