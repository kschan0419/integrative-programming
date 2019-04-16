import java.text.DecimalFormat;

public class Vehicle {
	private String model;
	private String number;
	private int speed;
	private int capacity;
	private double consumption;
	
	public Vehicle(String a, String b, int c, int d, double e){
		model = a;
		number = b;
		speed = c;
		capacity = d;
		consumption = e;
	}

	public void setModel(String a){
		model = a;
	}
	public void setNumber(String b){
		number = b;
	}
	public void setSpeed(int c){
		speed = c;
	}
	public void setCapacity(int d){
		capacity = d;
	}
	public void setConsumption(double e){
		consumption = e;
	}
	
	public String getModel(){
		return model;
	}
	public String getNumber(){
		return number;
	}
	public int getSpeed(){
		return speed;
	}
	public double getCapacity(){
		return capacity;
	}
	public double getConsumption(){
		return consumption;
	}
	
	public void fuelNeeded(double distance){
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Fuel Needed For " + distance + "km is " + df.format(distance*consumption) + " liter");
		
	}
	public void distanceCovered(int time){
		System.out.println("Distance Covered with speed " + speed +"km/h and " + time +"hours is " + time*speed +"km");
	}
	
	public void display(){
		System.out.println("Model : " + model);
		System.out.println("Registration Number : " + number);
		System.out.println("Speed (km/h) : " + speed);
		System.out.println("Fuel Capacity (liter) : " + capacity);
		System.out.println("Fuel Consumption (km/l) : " + consumption);
	}
	
}
