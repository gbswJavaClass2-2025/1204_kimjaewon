package sec01.exam01;

public class Animal {
    protected String bread;
    
    public Animal(String bread) {
        this.bread = bread;
    }

    void eat() {
        System.out.println(bread + "이/가 일반적인 방식으로 먹이를 먹습니다");
    }
    
    void eat(String food) {
        System.out.println(bread + "이/가 " + food + "을/를 맛있게 먹습니다");
    }

    void makeSound() {
        System.out.println(bread + "이/가 알 수 없는 소리를 냅니다");
    }
}
