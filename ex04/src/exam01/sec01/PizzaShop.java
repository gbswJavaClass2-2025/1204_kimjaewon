package exam01.sec01;

public class PizzaShop {

	public static void main(String[] args) {
		System.out.println("----- 피자 가게 시스템 실습 시작 -----");
		Pizza plain = new Pizza("씬 크러스트", 10);
		ToppingPizza mozzarella = new ToppingPizza("Mozzarella", "핸드 토스", 12, "모짜렐라");
		ToppingPizza pepperoni = new ToppingPizza("Pepperoni", "팬", 14, "페페로니");
		

		System.out.println("-------------------------");
		

		System.out.println("[4. 오버라이딩 (설명)]");
		plain.displayInfo();
		mozzarella.displayInfo();
		pepperoni.displayInfo();

		System.out.println("-------------------------");

		System.out.println("[4. 오버로딩 (굽기)]");
		plain.bake();
		plain.bake(15);
		pepperoni.bake();
		pepperoni.bake(20);
		pepperoni.bake(350,18);
		
	}

}
