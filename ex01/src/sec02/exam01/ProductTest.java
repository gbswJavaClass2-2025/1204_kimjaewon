package sec02.exam01;

public class ProductTest {
	
	public static void main(String[] args) {
		Product product1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product product2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product product3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		product1.informagtion();
		product2.informagtion();
		product3.informagtion();
		
		System.out.println("=======================================================");
		
		product1.setProduct(1200000, 0.05);
		product2.setProduct(1200000, 0.05);
		product3.setProduct(1200000, 0.05);
		product1.informagtion();
		product2.informagtion();
		product3.informagtion();

		System.out.println("=======================================================");
		
		System.out.println("상품명 : " + product1.getProductName());
		System.out.println("부가세 포함 가격 = " + product1.getActualPrice() + "원");
		System.out.println("상품명 : " + product2.getProductName());
		System.out.println("부가세 포함 가격 = " + product1.getActualPrice() + "원");
		System.out.println("상품명 : " + product3.getProductName());
		System.out.println("부가세 포함 가격 = " + product1.getActualPrice() + "원");
		
		
		
	
	}
}
