
public class Truck extends Vehicle {
	private double weight;
	
	public Truck(String a, String b, int c, int d, double e, double f) {
		super(a, b, c, d, e);
		weight = f;
	}

	public void setWeight(double f){
		weight = f;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public void display(){
		System.out.println("Truck Info :");
		super.display();
		System.out.println("Weight (kg) : "+ weight );
	}
	
}
