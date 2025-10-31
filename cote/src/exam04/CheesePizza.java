package exam04;

public class CheesePizza extends Pizza{
	
	public CheesePizza(String size) {
		super.name = "CheesePizza";
		super.prices = new int[] { 1000, 2000, 3000 };
		super.size = size;
		super.toppings = "cheese";
	}
}
