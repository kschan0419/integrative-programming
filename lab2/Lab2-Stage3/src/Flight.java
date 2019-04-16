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
	
	public String getFrom(){
		return source;
	}
	public String getTo(){
		return destination;
	}
	public String getFlightNum(){
		return flightNumber;
	}
	public String getDate(){
		return date;
	}
	public String getDepartureTime(){
		return departureTime;
	}
	public int getEconomyClassNum(){
		return economyClassNum;
	}
	public int getBusinessClassNum(){
		return businessClassNum;
	}
	public int getFirsrtClassNum(){
		return firstClassNum;
	}
	public ArrayList<BoardingPass> getBoardingPassList(){
		return boardingPassList;
	}
	
	public void printBoardingPass(){
		for (BoardingPass f : boardingPassList){
			System.out.println("Name:"+f.getPassenger().getName()+" | Frequent Flyer Number:"+f.getPassenger().getFrequentFlyerNum()+" | Security Number:"+f.getSecurityNum());
			System.out.println("From:"+source+" | To:"+destination+" | SSR:"+f.getPassenger().getSpecialServiceRequest()+" | Flight Number:"+flightNumber+" | Date:"+date+" | Departure:"+departureTime);
			System.out.println("Gate:"+f.getGate()+" | Gate Open:"+f.getGateOpen()+" | Class:"+f.getPassenger().getTicketClass()+" | Seat:"+f.getseat()+" | E-Ticket Number:"+f.getPassenger().getETicketNum());
			System.out.println();
		}
	}
	
}
