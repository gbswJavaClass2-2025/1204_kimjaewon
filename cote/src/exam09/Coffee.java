package exam09;

public class Coffee {
	protected String name;
	protected String size;
	protected int[] basePrice;
	protected int price;
	
	public Coffee(String name, String size) {
		this.name = name;
		this.size = size;
		this.basePrice = new int[] { 3500, 4000, 4500 };
		System.out.println(">> Coffee 객체 생성: " + size + " " + name);

		if (size == "Small") {
			this.price = basePrice[0];
		}
		if (size == "Medium") {
			this.price = basePrice[1];
		}
		if (size == "Large") {
			this.price = basePrice[2];
		}
	}
	
	public Coffee(String name, String size, int[] basePrice) {
		this.name = name;
		this.size = size;
		this.basePrice = basePrice;
		System.out.println(">> Coffee 객체 생성: " + size + " " + name);
		
		if (size == "Small") {
			this.price = basePrice[0];
		}
		if (size == "Medium") {
			this.price = basePrice[1];
		}
		if (size == "Large") {
			this.price = basePrice[2];
		}
	}

	public void getBeveragelInfo() {
		System.out.println(name + " : 종류: " + name + " | 사이즈: " + size + " 기본 가격: " + price + "원");
	}
	
	public void calculatePrice() {
		System.out.println(name + " 최종 가격(기본):" + price + "원");
	}
	
	public void calculatePrice(double discount) {
		System.out.println(name + " 최종 가격(할인): (할인율 " + discount + "% 적용)" + price * (100 - (
				int) discount) / 100  + "원");
	}
}
