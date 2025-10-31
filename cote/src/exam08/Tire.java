package exam08;

public class Tire {
	private String modelName;
	private int currentRotation;
	private int maximumRotation;

	public Tire(String modelName, int maximumRotation) {
		this.modelName = modelName;
		this.currentRotation = 0;
		this.maximumRotation = maximumRotation;
	}
	
	boolean roll() {
		if (currentRotation >= maximumRotation) {
			return false;
		}
		else {
			return true;
		}
	}
}
