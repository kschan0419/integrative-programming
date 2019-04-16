import java.util.ArrayList;

public class GeomObjArrayList {

  public static void main(String[] args) {
	ArrayList<GeometricObject> objects = new ArrayList<GeometricObject>();
	
	Circle circle1 = new Circle(1);
	Circle circle2 = new Circle(2);
	Rectangle rect1 = new Rectangle(2,2,"red",true);
	Rectangle rect2 = new Rectangle(3,6, "blue", false);
	
	objects.add(circle1);
	objects.add(circle2);
	objects.add(rect1);
	objects.add(rect2);
	
	System.out.println("Is the list empty? "+ objects.isEmpty());
	System.out.println("List size : "+ objects.size());
	Circle circle3 = new Circle(7);
	objects.add(2, circle3);
	objects.remove(circle1);

	for (int i=0; i<objects.size();i++){
		if (objects.get(i) instanceof Circle) {
			((Circle) objects.get(i)).printCircle();	 	
			System.out.println("The Circle area is " + ((Circle) objects.get(i)).getDiameter()); 
		} 
		else if (objects.get(i) instanceof Rectangle) {
			((Rectangle) objects.get(i)).printRectangle();	
		}
	}
	
	System.out.println("***");
	System.out.println(objects.toString());
  }

}
