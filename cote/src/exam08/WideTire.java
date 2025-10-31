package exam08;

public class WideTire extends Tire{
	private int width;
	
	public WideTire(String modelName, int maximumRotation, int width) {
		super(modelName, maximumRotation);
		this.width = width;
	}
}
