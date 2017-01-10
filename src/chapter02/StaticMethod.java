package chapter02;

public class StaticMethod {
	private int n;
	private static int m;
	
	// 인스턴스 메소드에서는 인스턴스 변수 접근 가능
	public void f1( int x ) {
		n = x;
	}

	// 인스턴스 메소드에서는 static 변수 접근이 가능
	public void f2( int x ) {
		//네임스페이스가 되는 클래스 이름은 클래스안에서 생략 가능
		//StaticMethod.m = x;
		m = x;
		
		// static 메소드도 접근 가능
		s1(x);
	}
	
	// static 메소드에서는 인스턴스 변수 접근이 불가능
	public static void s1( int x ){
		//n = x;    // 에러
		//f2( x );  // 에러
	}
	
	// static 메소드에서는 static 변수만 접근 가능하다.
	public static void s2( int x ) {
		m = x;
		s1( x ); // static 메소드도 접근 가능 하다.
	}
}
