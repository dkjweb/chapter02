package paint;

public class PaintApp {

	public static void main(String[] args) {
		
		Point pt1 = new Point();
		pt1.setX( 100 );
		pt1.setY( 200 );
		pt1.show();
		
		Point pt2 = new Point(50, 100);
		pt2.show();
		
		pt1.show( false );
		pt2.show( false );
		pt2.show( true );

	}

}
