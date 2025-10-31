package exam09;

public class Latte extends Coffee{
	private String foamType;
	private int milkCharge;
	
	public Latte(String name, String size, String foamType) {
		super(name, size, new int[] { 4500, 5000, 5500 });
		this.foamType = foamType;
		this.milkCharge = 500;
	}

	@Override
	public void getBeveragelInfo
	() {
		System.out.println(name + " 정보: 종류: " + name + " | 사이즈: " + size + " 기본 가격: " + price + "원 | 거품 종류: **" + foamType + "**");
	}
	
	public void calculatePrice(int addShot) {
		System.out.println(name + " 최종 가격(샷 추가): (우유 비용 " + milkCharge + "원 포함 (+샷 추가 " + addShot + "원))" + (price + addShot + milkCharge) + "원");
	}
}
