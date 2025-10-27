package sec01.exam01;

public class Dog extends Animal{
    private String bread;

    public Dog(String bread) {
    	super(bread);
        this.bread = bread;
    }

    void eat(int calorie) {
        System.out.println(bread + ": 개(" + bread + ")가 " + calorie + " 칼로리만큼 에너지를 보충합니다.");
    }

    @Override
    void makeSound() {
        System.out.println("멍멍! (품종: " + bread + ")");
    }

}
