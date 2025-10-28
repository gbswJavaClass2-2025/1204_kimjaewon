package sec01.exam01;

public class Animal {
    protected String species;
    
    public Animal(String species) {
        this.species = species;
    }

    void eat() {
        System.out.println(species + "이/가 일반적인 방식으로 먹이를 먹습니다");
    }
    
    void eat(String food) {
        System.out.println(species + "이/가 " + species + "을/를 맛있게 먹습니다");
    }

    void makeSound() {
        System.out.println(species + "이/가 알 수 없는 소리를 냅니다");
    }
    
    void displayInfo() {
    	System.out.println("--- " + species + " 정보 ---");
    }
}
