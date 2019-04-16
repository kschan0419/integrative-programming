
public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck truck = new Truck ("Isuzu","WHH4962",90,150,1.06,36000);
		truck.display();
		truck.fuelNeeded(98.2);
		truck.distanceCovered(5);
		
		System.out.println();
		
		Bus bus = new Bus ("Mitsubishi","BEB1063",160,100,1.5,40);
		bus.display();
		bus.fuelNeeded(100);
		bus.distanceCovered(5);
		
	}

}
