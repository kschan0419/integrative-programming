import java.util.ArrayList;

public class FlightPlanTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Flight> flightList = new ArrayList<Flight>();
		
		Flight f1 = new Flight("HEATHROW-LONDON", "KUALA LUMPUR", "MH001", "19 APR", "22:00");
		Flight f2 = new Flight("CDG-PARIS", "JFK-NEW YORK", "Icelandair 541", "20 JUN", "15:00");
		Flight f3 = new Flight("ADL-ADELAIDE", "DOH-DOHA", "EY6311", "13 JUL", "00:40");
				
		flightList.add(f1);
		flightList.add(f2);
		flightList.add(f3);
		
		System.out.println("Total number of flights :"+ flightList.size());
		System.out.println("== Flight Plan ==");
		for (Flight f: flightList) { 
			System.out.println();
	    	System.out.println("From : "+ f.getFrom());
	    	System.out.println("To : "+ f.getTo());
	    	System.out.println("Flight Number : "+ f.getFlightNum());
	    	System.out.println("Date : "+ f.getDate());
	    	System.out.println("Departure Time : "+ f.getDepartureTime());
	    }
	}

}
