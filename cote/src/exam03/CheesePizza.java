package exam03;

public class CheesePizza {
	public String name = "Cheese Pizza";
	public int[] prices = { 1000, 2000, 3000 };
	public String size = "M";
	
	public CheesePizza() {
		this.size = "M";
	}
	
	public CheesePizza(String sizes) {
		this.size = sizes;
	}
	
	void cook() {
		System.out.println(name + " " + size + "을/를 조리합니다.");
		System.out.println(name + " " + size + "이/가 완성되었습니다.");
	}

	void serve() {
		if (this.size == "S") {
			System.out.println(name + " " + size + "을/를 드립니다. " + prices[0] + "원입니다.");
		}
		if (this.size == "M") {
			System.out.println(name + " " + size + "을/를 드립니다. " + prices[1] + "원입니다.");
		}
		if (this.size == "L") {
			System.out.println(name + " " + size + "을/를 드립니다. " + prices[2] + "원입니다.");
		}
	}
}
