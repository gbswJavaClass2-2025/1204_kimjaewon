package exam04;

public class PizzaExample {

	public static void main(String[] args) {
		CheesePizza cheesepizza = new CheesePizza("L");
		PepperoniPizza pepperonipizza = new PepperoniPizza("L");
		
		cheesepizza.cook();
		cheesepizza.serve();
		pepperonipizza.cook();
		pepperonipizza.serve();
	}

}
