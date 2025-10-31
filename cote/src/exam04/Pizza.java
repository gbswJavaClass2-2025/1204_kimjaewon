package exam04;

public abstract class Pizza {
	protected String name;
	protected int[] prices;
	protected String size;
	protected String toppings;
	
	
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
