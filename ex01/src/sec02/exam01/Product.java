package sec02.exam01;

public class Product {
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	void informagtion() {
		System.out.println(productId + " " + productName +  " " + productArea +  " " + price +  " " + tax);
	}
	
	Product() {
		
	}
	
	Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	void setProduct(int price, double tax) {
		this.price = price;
		this.tax = tax;
	}
	String getProductName() {
		return productName;
	}
	int getActualPrice() {
		return price + (int)(price * tax);
	}
}
