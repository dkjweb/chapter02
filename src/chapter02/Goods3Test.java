package chapter02;

public class Goods3Test {

	public static void main(String[] args) {
		Goods3 g = new Goods3();
		g.setName( "nikon" );
		g.setPrice( 10000000 );
		g.setCountSold( 100 );
		g.setCountSold( 20 );
		
		//위의 코드 대신에 다음 생성자로 객체를 생성하면 초기화 
		Goods3 g2 = 
			new Goods3("nikon", 1000000, 100, 20);
		
		System.out.println( g );
		System.out.println( g2 );
	}

}
