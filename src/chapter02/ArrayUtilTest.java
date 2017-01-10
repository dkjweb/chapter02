package chapter02;

public class ArrayUtilTest {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		
		double[] d = ArrayUtil.intToDouble( a );
		for( double v : d ) {
			System.out.println( v );
		}
		
		double[] d1 = { 3.14, 20.8, 30.4 };
		int[] a1 = ArrayUtil.doubleToInt( d1 );
		for( int v : a1 ) {
			System.out.println( v );
		}
		
		int[] a2 = { 1, 2, 3, 4, 5 };
		int[] a3 = { 6, 7, 8, 9, 10 };
		int[] a4 = ArrayUtil.concat(a2, a3);
		for( int v : a4 ) {
			System.out.println( v );
		}

	}

}
