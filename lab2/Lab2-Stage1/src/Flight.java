import java.util.ArrayList;

public class Flight {
	private String flightNumber;
	private String date;
	private String departureTime;
	private int firstClassNum;
	private int businessClassNum;
	private int economyClassNum; 
	private String source;
	private String destination;
	
	private ArrayList<BoardingPass> boardingPassList; 

	public Flight(String a,String b,String c,String d,String e){
		source = a;
		destination = b;
		flightNumber= c;
		date= d;
		departureTime= e;
		firstClassNum=0;
		businessClassNum=0;
		economyClassNum=0;
		boardingPassList = new ArrayList<BoardingPass>();
	}

}
