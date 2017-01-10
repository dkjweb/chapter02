package chapter02;

public class Goods3 {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	//기본 생성자
	//기본 생성자는 직접 생성자를 정의하는 경우 자동으로 만들어지지 않는다.
	public Goods3(){
	}
	
	public Goods3(
		String name, 
		int price, 
		int countStock, 
		int countSold){
		
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
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
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	@Override
	public String toString() {
		return "Goods3 [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}
	
	
}
