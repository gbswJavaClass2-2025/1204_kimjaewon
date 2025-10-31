package exam04;

public class PepperoniPizza extends Pizza{
	
	public PepperoniPizza(String size) {
		super.name = "PepperoniPizza";
		super.prices = new int[] { 1500, 2500, 3500 };
		super.size = size;
		super.toppings = "pepperoni";
	}
	
	@Override
	void cook() {
		System.out.println(toppings + "을/를 추가합니다.");
		System.out.println(name + " " + size + "을/를 조리합니다.");
		System.out.println(name + " " + size + "이/가 완성되었습니다.");
	}

}
