package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point pt1 = new Point();
		pt1.setX( 100 );
		pt1.setY( 200 );
		Point pt2 = new Point(50, 100);
		ColorPoint pt3 = new ColorPoint( 500, 500, "red" );

		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		
		// 그리기
		drawPoint( pt1 );
		drawPoint( pt2 );
		drawPoint( pt3 );
		
//		drawRectangle( rectangle );
//		drawCircle( circle );
		drawShape( rectangle );
		drawShape( circle );
	}


	public static void drawPoint( Point point ) {
		point.show();
	}

	public static void drawShape( Shape shape ) {
		shape.draw();
	}
//	public static void drawRectangle( Rectangle rectangle ) {
//		rectangle.draw();
//	}
//	public static void drawCircle( Circle circle ) {
//		circle.draw();
//	}
}
