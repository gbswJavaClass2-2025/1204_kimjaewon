package exam08;

public class ColorTire extends Tire{
	private String color;
	
	public ColorTire(String modelName, int maximumRotation, String color) {
		super(modelName, maximumRotation);
		this.color = color;
	}
}
