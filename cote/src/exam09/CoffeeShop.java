package exam09;

public class CoffeeShop {

	public static void main(String[] args) {
		System.out.println("----- 커피 전문점 시스템 실습 시작 -----");
		
		Coffee americano = new Coffee("아메리카노", "Medium");
		Latte caramelLatte = new Latte("카라멜 라떼", "Large", "벨벳 폼");

		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println("[4. 오버라이딩 (음료 정보)]");
		americano.getBeveragelInfo();
		caramelLatte.getBeveragelInfo();
		
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("[3. 오버로딩 (가격 계산)]");
		
		americano.calculatePrice();
		americano.calculatePrice(10.0);
		
		System.out.println();
		
		caramelLatte.calculatePrice();
		caramelLatte.calculatePrice(20.0);
		caramelLatte.calculatePrice(1000);
		
		System.out.println();
		System.out.println("----- 실습 종료 -----");
		
	}

}
