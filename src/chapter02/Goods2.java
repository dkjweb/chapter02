package chapter02;

public class Goods2 {
	public static int countOfGoods;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	//기본 생성자
	public Goods2() {
		//System.out.println( "기본 생성자 호출" );
		countOfGoods++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0 ) {
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	// return 값이 있고, 파라미터가 없는 메소드
	public int getCountSold() {
		return countSold;
	}
	// return 값이 없고, 파라미터가 있는 메소드
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	// return값이 없고, 파라미터도 없는 메소드
	public void showInfo(){
		System.out.println(
		"name=" + name + "," +
		"price=" + price + "," +
		"countStock=" + countStock + "," +
		"countSold=" + countSold
		);
	}
	
	// return 값이 있고, 파라미터도 있는 메소드
	public double calcDiscountPrice( double rate ) {
		double discountPrice = price * rate;
		return discountPrice;
		//return price * rate;
	}
	
}
