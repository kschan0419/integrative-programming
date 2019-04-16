import java.util.ArrayList;

public class Flight {
	private String from;
	private String to;
	private String flightNum;
	private String date;
	private String departureTime;
	private int firstClassNum;
	private int businessClassNum;
	private int economyClassNum;
	private ArrayList<BoardingPass> boardingPassList;
	
	public Flight(String f, String t, String fn, String d, String dt){
		this.from = f;
		this.to = t;
		this.flightNum = fn;
		this.date = d;
		this.departureTime = dt;
		this.firstClassNum = 0;
		this.businessClassNum = 0;
		this.economyClassNum = 0;
		
		boardingPassList = new ArrayList<BoardingPass>();
		
		// Hardcoded elements of ArrayList for demonstration purposes!
		Passenger p1 = new Passenger("AZIZ/MOHD AZLAN DR", "A11041969", "MALAYSIA", 'M', "MH 304662573 BLUE", "2322431195130", "MOML", 'O', "L90HT");
		BoardingPass bp1 = new BoardingPass(p1, 40, 'A', "21:00", "58A");
		Passenger p2 = new Passenger("MOHD AZLAN/MARWA HUMAIRA MS", "A05092010", "MALAYSIA", 'F', "", "2322431195137","MOML CHD", 'B', "L91HT");
		BoardingPass bp2 = new BoardingPass(p2, 41, 'A', "21:00", "58B");
		
		boardingPassList.add(bp1);
		boardingPassList.add(bp2);
	}
	
	public String getFrom(){
		return this.from;
	}
	
	public String getTo(){
		return this.to;
	}
	
	public String getFlightNum(){
		return this.flightNum;
	}
	
	public String getDate(){
		return this.date;
	}
	
	public String getDepartureTime(){
		return this.departureTime;
	}
	
	public int getFirstClassNum(){
		return this.firstClassNum;
	}
	
	public int getBusinessClassNum(){
		return this.businessClassNum;
	}
	
	public int getEconomyClassNum(){
		return this.economyClassNum;
	}
	
	public ArrayList<BoardingPass> getBoardingPassList(){
		return boardingPassList;
	}
	
	public boolean isRegisteredPassenger(String s) {
		for (BoardingPass boardingPass: boardingPassList) {
			if (boardingPass.getPassenger().getPassportNum().equals(s) ||
				boardingPass.getPassenger().getETicketNum().equals(s) ||
				boardingPass.getPassenger().getPNR().equals(s))
				return true;
		}
		
		return false;
	}
	
	public BoardingPass getBoardingPass(String s) {
		for (BoardingPass boardingPass: boardingPassList) {
			if (boardingPass.getPassenger().getPassportNum().equals(s) ||
				boardingPass.getPassenger().getETicketNum().equals(s) ||
				boardingPass.getPassenger().getPNR().equals(s))
				return boardingPass;
		}
		
		return null;
	}
	
		
}
