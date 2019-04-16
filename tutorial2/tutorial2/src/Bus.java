
public class Bus extends Vehicle {
	private int passenger;
	
	public Bus(String a, String b, int c, int d, double e, int f) {
		super(a, b, c, d, e);
		passenger = f;
	}
	
	public void setPassenger(int f){
		passenger = f;
	}
	
	public int getPassenger(){
		return passenger;
	}
	
	public void display(){
		System.out.println("Bus Info :");
		super.display();
		System.out.println("No Of Passengers : "+ passenger );
	}
	
}
