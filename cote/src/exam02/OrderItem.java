package exam02;

public class OrderItem {
	public String menu;
	public int quantity;
	
	
	OrderItem(String menu, int quantity) {
		this.menu = menu;
		this.quantity = quantity;
	}
	
	int getPrice(int price, int quantity) {
		return price * quantity;
	}
	
}
