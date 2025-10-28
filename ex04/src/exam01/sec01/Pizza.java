package exam01.sec01;

public class Pizza{
    protected String dough;
    protected int sizeInInch;
    
    public Pizza (String dough, int sizeInInch) {
    	this.dough = dough;
    	this.sizeInInch = sizeInInch;
    	System.out.println(",>>Pizza 객체 생성: " + dough + " " + sizeInInch + "인치 피자");
    }
    
    void bake() {
    	System.out.println("Plain Pizza: 오븐에서 표준시간 동안 피자를 굽습니다.");
    }

    void bake(int time) {
    	System.out.println("Plain Pizza: " + time + "분 동안 특별히 피자를 굽습니다.");
    }
    
    void displayInfo() {
    	System.out.println("Plain Pizza: " + sizeInInch + "인치, " + dough + "도우를 사용한 기본 피자입니다.");
    }
}
