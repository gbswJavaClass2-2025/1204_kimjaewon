package sec01.exam01;

public class PracticeExample{
	public static void main(String[] args) {
        System.out.println("----- 실습 시작 -----");
        System.out.println("Animal 객체 생성 : 호랑이");
        Animal tiger = new Animal("호랑이");
        System.out.println("Animal 객체 생성 : 개");
        Dog dog = new Dog("골든 리트리버");

        System.out.println("[1. 상속 & 객체]");
        tiger.displayInfo();
        dog.displayInfo();

        System.out.println("[4. 오버라이딩]");
        tiger.makeSound();
        dog.makeSound();
        
        System.out.println("[3. 오버로딩]");
        tiger.eat();
        tiger.eat("생고기");
        dog.eat();
        dog.eat("개껌");
        dog.eat(500);
        
        
        
	}

}
