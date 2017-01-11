package paint;

public class Shape {
	private String color;

	public Shape() {
	}
	
	public Shape( String color ) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void draw(){
		System.out.println( "구체적인 도형을 그릴 수 없습니다." );
	}
}
