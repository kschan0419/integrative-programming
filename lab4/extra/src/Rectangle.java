
public class Rectangle extends GeometricObject {
	private double height;
	private double width;
	
	public Rectangle(){
	}
	
	public Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	
	public Rectangle(double height, double width, String color, boolean filled){
		this.height = height;
		this.width = width;
		setColor(color);
		setFilled(filled);
	}
	
	public void setHeight(double height){
		this.height= height;
	}
	
	public void setWidth(double width){
		this.width= width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getPerimeter(){
		return 2 * width * height;
	}
	
	public void printRectangle(){
		System.out.println("The rectangle is created "+ getDateCreated() + " and the area is " +getArea());
	}
}
