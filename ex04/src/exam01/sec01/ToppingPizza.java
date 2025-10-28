package exam01.sec01;

public class ToppingPizza extends Pizza{
    String topping;
    String name;
    
	public ToppingPizza(String name, String dough, int sizeInInch, String topping) {
		super(dough, sizeInInch);
		this.name = name;
		this.topping = topping;
	}
    
    void bake() {
    	System.out.println(name + " Pizza(표준): 오븐에서 표준시간 동안 피자를 굽습니다.");
    }

    void bake(int time) {
    	System.out.println(name + " Pizza(시간 지정): " + time + "분 동안 특별히 피자를 굽습니다.");
    }
    
    void bake(int time, int temperature) {
    	System.out.println(name + " Pizza(온도+시간 지정): " + temperature + "도에서 " + time + "분 동안 특별히 피자를 굽습니다.");
    }
    
	@Override
	void displayInfo() {
    	System.out.println(name + " Pizza:" + sizeInInch + "인치, " + dough + " 도우를 사용한 기본 피자입니다. 주요 토핑은 **" + topping + "** 입니다.");
	}
	
	
}
