package exam02;

public class OrderExample {

	public static void main(String[] args) {
		Menu a = new Menu("짜장면", 10000);
		Menu b = new Menu("탕수육", 10000);
		Menu c = new Menu("짬뽕", 10000);
		
		OrderItem orderitem = new OrderItem("짜장면", 3);
		System.out.println(orderitem.getPrice(10000, 3));
	}

}
